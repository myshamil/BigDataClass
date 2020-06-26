wbcd<-read.csv('r_datas/wisc_bc_data.csv', stringsAsFactors = FALSE)
str(wbcd)
wbcd[2]
wbcd<-wbcd[-1] #1번 컬럼을 제외한 나머지를 출력
#wbcd<-wbcd[c(-1,-3,-5)] #여러 컬럼을 제외하는 방법
str(wbcd)
table(wbcd$diagnosis) #diagnosis컬럼의 sum?
wbcd$diagnosis<-factor(wbcd$diagnosis, levels=c('B',"M"), labels=c('Benign','Malignant'))
str(wbcd)
typeof(table(wbcd$diagnosis)) #integer vector
table(wbcd$diagnosis)[1]
round(prop.table(table(wbcd$diagnosis))*100,1) #round(대상, 소숫점이하 자릿수)
wbcd[c('radius_mean', 'area_mean')]
normalize<-function(x){
  #print(min(x))
  #print(max(x))
  return((x-min(x))/(max(x)-min(x)))
}
#print(normalize(c(1,2,3,4,5)))
#lapply():리스트에 저장된 자료(열벡터)에 대해 특정함수
#데이터프레임은 동일한 길이의 벡터들로 구성된 리스트
wbcd[2:31]
wbcd_n<-as.data.frame(lapply(wbcd[2:31], normalize))

summary(wbcd_n$area_mean)
range(wbcd$area_mean)
#트레이닝, 테스트 (7:3) 분리
wbcd_train<-wbcd_n[1:469,]
wbcd_test<-wbcd_n[470:569,]

wbcd_train_labels<-wbcd[1:469,1]
wbcd_test_labels<-wbcd[470:569,1]
#console창 클리어 하는 방법 : ctrl + l
#모델링
#knn함수
#knn함수 -> class(패키지 이름) :: knn(함수 이름)
#install.packages("class")
#library(class)

wbcd_test_pred<-knn(train=wbcd_train, test= wbcd_test, cl= wbcd_train_labels, k=5)
wbcd_test_pred
#크로스테이블, 교차테이블 ->교차분석
#변수간의 관련성의 여부를 분석 CrossTable 
install.packages("gmodels")
library(gmodels)
CrossTable(x=wbcd_test_labels, y=wbcd_test_pred)

#z점수 표준화
wbcd_z<-as.data.frame(scale(wbcd[-1]))
summary(wbcd_z$area_mean)
#표준화를 했기 떄문에 평균이 0으로 나옴

#knn 모델 ->교차분석(정확도)
#k =1,5,11,15,21,27 로 주고 비교해보기

wbcd_z
wbcd_z_train<-wbcd_z[1:469,]
wbcd_z_test<-wbcd_z[470:569,]
wbcd_z_train_labels<-wbcd_z[1:469,1]
wbcd_z_test_labels<-wbcd_z[470:569,1]

wbcd_z_test_pred1<-knn(train=wbcd_z_train, test= wbcd_z_test, cl= wbcd_z_train_labels, k=1)
wbcd_z_test_pred1
wbcd_z_test_pred2<-knn(train=wbcd_z_train, test= wbcd_z_test, cl= wbcd_z_train_labels, k=5)
wbcd_z_test_pred2


###실습
diabetes<-read.csv('diabetes.csv', stringsAsFactors = FALSE)
diabetes

di_n<-diabetes[-9]
di_n
di_train<-di_n[1:499,]
di_train
di_test<-di_n[500:633,]
di_test
di_train_labels<-diabetes[1:499,9]
di_test_labels<-diabetes[500:633,9]

for (i in 1:50){
  if(i%%2 != 0){
    di_test_pred <- knn(train = di_train, test = di_test, cl = di_train_labels, k=i)
    print(i)
    CrossTable(x =di_test_labels, y = di_test_pred)
  }
}

