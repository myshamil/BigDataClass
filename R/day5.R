teens <-read.csv("snsdata.csv")
str(teens) #데이터를 불러오면 꼭 찍어보기
#개인의 특성을 나타내는 컬럼이 4개 관심사 36개 data.frame':	30000 obs. of  40 variables
#gender에 NA가 있음.
table(teens$gender) #$특정 열벡터 추출 table: 종류별로 몇개씩인지 NA는 안세줌

table(teens$gender, useNA="ifany") #NA 갯수도 추출

#  F     M    <NA> 
#22054  5222  2724 
summary(teens$age)
#13~20은 정상범위 비정상범위는 NA로 바꿔버리자
#ifelse(조건, 참, 거짓)
teens$age<-ifelse(teens$age>=13 & teens$age<20,teens$age,NA)
summary(teens$age)
# Min. 1st Qu.  Median    Mean 3rd Qu.    Max.    NA's 
#13.03   16.30   17.27   17.25   18.22   20.00    5523 
#13~20세 사이로 바뀌엇다

teens$female<-ifelse(teens$gender=="F"& !is.na(teens$gender),1,0)

teens$female

teens$no_gender<-ifelse(is.na(teens$gender),1,0)
#NA면 1 아니면 0
table(ifelse(teens$gender=="F"& !is.na(teens$gender),1,0))
#여성 22000 남성&NA 8000
table(ifelse(teens$gender=="F",1,0))
#여성 22000, 남성 5000(NA 는 계산에서 제외)
#즉 NA에 대한 조건을 주지 않으면 계산에서 제외된다.


#결측값처리 관련
teens$age #NA 확인..
summary(teens$age) #NA 5523개

mean(teens$age) #NA 값 때문에 NA로 나옴

mean(teens$age, na.rm = TRUE)#NA값 제외

#데이터를 그룹화 한 다음, 특정 통계함수 적용하기 :aggregate


#NA를 제거한 다음, 졸업 연도를 기준으로 그룹화, 그룹별 평균연령을 출력
#teens 데이터에서 grayear열을 기준으로 그룹화, 그룹별로 age 컬럼값의 평균을 출력
aggregate(data=teens, age~gradyear, mean, na.rm=TRUE)

#avg_age 함수 정의
avg_age<-ave(teens$age, teens$gradyear, FUN = function(x) mean(x, na.rm=TRUE))

ifelse(is.na(teens$age),avg_age, teens$age)
#teens$age가 NA 면 함수를 계산한 값으로, 아니면 원래 값으로 하자는 뜻

summary(teens$age) #결측값 제거됨.

interests<-teens[5:40]
interests

#표준화하기
interests_z<-as.data.frame(lapply(interests, scale) )#결과는 리스트이기 떄문에 데이터 프레임으로 바꿈

set.seed(2345) #랜덤값을 맞추기 위해 지정함

teen_clusters<-kmeans(interests_z, 5)

teen_clusters
#1038, 601, 4066, 2696, 21599 (각 클러스터를 구성하는 갯수)
#Cluster means:
#    basketball    football      soccer   softball  volleyball    swimming cheerleading
#1  0.362160730  0.37985213  0.13734997  0.1272107  0.09247518  0.26180286    0.2159945
#2 -0.094426312  0.06691768 -0.09956009 -0.0379725 -0.07286202  0.04578401   -0.1070370
#3  0.003980104  0.09524062  0.05342109 -0.0496864 -0.01459648  0.32944934    0.5142451
#4  1.372334818  1.19570343  0.55621097  1.1304527  1.07177211  0.08513210    0.0400367
#5 -0.186822093 -0.18729427 -0.08331351 -0.1368072 -0.13344819 -0.08650052   -0.1092056
#해당 클러스터의 중심점의 좌표
#Clustering vector: 3만명에 대해 각각 그룹을 알려줌
#Available components:
#[1] "cluster"      "centers"      "totss"        "withinss"     "tot.withinss"
#[6] "betweenss"    "size"         "iter"         "ifault"   

teen_clusters$size
teen_clusters$centers
teens$cluster<-teen_clusters$cluster

teens[1:5,c('cluster','gender','age','friends')]

#클러스터 별로 나이의 평균
aggregate(data=teens, age~cluster,mean)
#별차이가 없는것이 나이랑은 상관이 없는듯
#클러스터별로 여학생 수의 평균
aggregate(data=teens, female~cluster,mean)
#female이 1로 지정되어잇어서  3번그룹이 88퍼 여학생

