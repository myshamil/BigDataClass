#연습문제
#1. 성별 컬럼의 결측값을 적절하게 처리하시오.(knn->성별유추)
#2. iris 데이터에 대해 3개의 클러스터로 나누세요. 3개 클러스터 중심좌표, 시각화 ggplot
#3. 2번에서 만든 결과에 대해, 임의의 iris 데이터가 입력되었을때
#   어느 클러스터에 속하는지 출력하는 프로그램을 작성하시오.
teens <-read.csv("snsdata.csv")
teens
iris

#####
str(teens)
str(iris)
#####
table(teens$gender, useNA="ifany")
#   F     M    <NA> 
# 22054  5222  2724 
#NA 값을 "A"로 바꿈
teens$gender<-ifelse(is.na(teens$gender)== TRUE,"A",teens$gender)
teens$gender



###################################
aggregate(data=iris, Sepal.Length~Species, mean, na.rm=TRUE)
iris2<-iris[1:5]
iris2
iris_z<-as.data.frame(lapply(iris2, scale))
iris_z
iris_cluster<-kmeans(iris_z, 3)
iris_cluster

#install.packages("ggplot2")
#library(ggplot2)
ggplot(data = iris_z, mapping = aes(x = Sepal.Length, y = Sepal.Width)) + geom_point(alpha = 0.5,colour = c("purple", "blue", "red")[iris$Species])

