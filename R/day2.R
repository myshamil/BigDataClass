usedcars<-read.csv("usedcars.csv", stringsAsFactors = TRUE)
usedcars
str(usedcars)
#팩터와 스트링의 비율을 보고 많은 쪽으로 바꾸는 것이 좋다. 
#몇개의 레벨로 나누어져 있는가 (몇가지 인가)
summary(usedcars)#기술통계 (describe)

summary(usedcars[c('price','mileage')])

(36+44+56)/3
mean(c(35,44,56))
median(c(36,44,56))

range(usedcars$price) #최대최소 확인

diff(range(usedcars$price)) #최대 - 최소

summary(usedcars$price)
IQR(usedcars$price) #3사분위수에서 1사분위 수 를 뺸값

#1사분위수(10995)-1.5*IQR(3909)=값보다 작은 값은 outlier
#3사분위수(14904)+1.5*IQR(3909)=값보다 큰 값은 outlier

quantile(usedcars$price) #five-number

quantile(usedcars$price, probs = c(0.1,0.9)) #백분위수기준으로 세분화된검색가능

seq(0,1,0.2) #0부터 1까지 0.2씩

quantile(usedcars$price, probs =seq(0,1,0.2))

boxplot(usedcars$price, ylab ='Price', main ="Boxplot")

hist(usedcars$price, ylab ='Price', main ="histogram")

var(usedcars$price) #분산
sd(usedcars$price) #표준편차

#68 / 95 / 99.7
# 2시그마 : 68%(-시그마부터 시그마까지)
# 4시그마 : 95%(-2시그마부터 2시그마까지)
# 6시그마 : 99.7%(-3시그마부터 3시그마까지)

#수치변수 ->summary
#범주변수 ->table
table(usedcars$model)

table(usedcars$year)
table(usedcars$model)
round(prop.table(table(usedcars$model))*100,digits=1)


#잘잤다
table(usedcars$model)
table(usedcars$year) # -> 수치변수에 table을 넣으면 : 구분된다.(value_counts느낌)
#round(x,dight=y) 소수점 y자리수만큼(반올림)


plot(x = usedcars$mileage,
     y = usedcars$price)
#이원교차표 : 두 변수간의 관계를 관찰
#model : 범주형 / color : 범주형

install.packages("gmodels") # = pip install 패키지명
library(gmodels)  #해줘야 crosstable인식

usedcars$conservative<-usedcars$color %in% c("Black","Gray","Silver","White")
# 포함되면 true 아니면 false
table(usedcars$conservative)

CrossTable(x=usedcars$model, y = usedcars$conservative)
#모델(독립)이 색(종속) 선택에 영향을 줄것인가?


cars#자동차 속도 (만든적 없는데 이미 만들어저 있는 변수)

str(cars)
head(cars)
summary(cars)

plot(cars$speed, cars$dist, xlab='speed(MPH)',ylab='distance(feet)',main='stopping distance of cars based on speed')


cor(cars)
cor(cars$speed, cars$dist)


#선형회귀 모델 만들어보기
#lm(종속변수~독립변수들, data)
mymodel<-lm( dist~speed ,cars)
#mymodel<-lm(dist~speed+wind+temp, cars)
#h(x)=w1*1+w2*2+w3*3+b

newd<-data.frame(speed=c(10,30,50,100))
newd

predict(mymodel, newd)


iris
nrow(iris)


#knn 알고리즘(k-nearest neighbors, 유유상종)
#k:이웃의 수 <-중요함
#보통 3 또는 5로 정하고 크게주면 7까지 준다

wbcd<- read.csv("wisc_bc_data.csv", stringsAsFactors = FALSE)
str(wbcd)

wbcd[1]
wbcd[1:2,]

#만들어보기 실습
hours=c(3,7,6,9,4,2)
scores=c(50,80,60,75,70,55)
plot(x =hours, y= scores)
g = lm(scores~hours)
g
abline(g)

