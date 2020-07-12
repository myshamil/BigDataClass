usedcars<-read.csv("usedcars.csv", stringsAsFactors = TRUE)
usedcars
str(usedcars)
#���Ϳ� ��Ʈ���� ������ ���� ���� ������ �ٲٴ� ���� ����. 
#��� ������ �������� �ִ°� (��� �ΰ�)
summary(usedcars)#������ (describe)

summary(usedcars[c('price','mileage')])

(36+44+56)/3
mean(c(35,44,56))
median(c(36,44,56))

range(usedcars$price) #�ִ��ּ� Ȯ��

diff(range(usedcars$price)) #�ִ� - �ּ�

summary(usedcars$price)
IQR(usedcars$price) #3����������� 1����� �� �� �A��

#1�������(10995)-1.5*IQR(3909)=������ ���� ���� outlier
#3�������(14904)+1.5*IQR(3909)=������ ū ���� outlier

quantile(usedcars$price) #five-number

quantile(usedcars$price, probs = c(0.1,0.9)) #��������������� ����ȭ�Ȱ˻�����

seq(0,1,0.2) #0���� 1���� 0.2��

quantile(usedcars$price, probs =seq(0,1,0.2))

boxplot(usedcars$price, ylab ='Price', main ="Boxplot")

hist(usedcars$price, ylab ='Price', main ="histogram")

var(usedcars$price) #�л�
sd(usedcars$price) #ǥ������

#68 / 95 / 99.7
# 2�ñ׸� : 68%(-�ñ׸����� �ñ׸�����)
# 4�ñ׸� : 95%(-2�ñ׸����� 2�ñ׸�����)
# 6�ñ׸� : 99.7%(-3�ñ׸����� 3�ñ׸�����)

#��ġ���� ->summary
#���ֺ��� ->table
table(usedcars$model)

table(usedcars$year)
table(usedcars$model)
round(prop.table(table(usedcars$model))*100,digits=1)


#�����
table(usedcars$model)
table(usedcars$year) # -> ��ġ������ table�� ������ : ���еȴ�.(value_counts����)
#round(x,dight=y) �Ҽ��� y�ڸ�����ŭ(�ݿø�)


plot(x = usedcars$mileage,
     y = usedcars$price)
#�̿�����ǥ : �� �������� ���踦 ����
#model : ������ / color : ������

install.packages("gmodels") # = pip install ��Ű����
library(gmodels)  #����� crosstable�ν�

usedcars$conservative<-usedcars$color %in% c("Black","Gray","Silver","White")
# ���ԵǸ� true �ƴϸ� false
table(usedcars$conservative)

CrossTable(x=usedcars$model, y = usedcars$conservative)
#��(����)�� ��(����) ���ÿ� ������ �ٰ��ΰ�?


cars#�ڵ��� �ӵ� (������ ���µ� �̹� ������� �ִ� ����)

str(cars)
head(cars)
summary(cars)

plot(cars$speed, cars$dist, xlab='speed(MPH)',ylab='distance(feet)',main='stopping distance of cars based on speed')


cor(cars)
cor(cars$speed, cars$dist)


#����ȸ�� �� ������
#lm(���Ӻ���~����������, data)
mymodel<-lm( dist~speed ,cars)
#mymodel<-lm(dist~speed+wind+temp, cars)
#h(x)=w1*1+w2*2+w3*3+b

newd<-data.frame(speed=c(10,30,50,100))
newd

predict(mymodel, newd)


iris
nrow(iris)


#knn �˰�����(k-nearest neighbors, ��������)
#k:�̿��� �� <-�߿���
#���� 3 �Ǵ� 5�� ���ϰ� ũ���ָ� 7���� �ش�

wbcd<- read.csv("wisc_bc_data.csv", stringsAsFactors = FALSE)
str(wbcd)

wbcd[1]
wbcd[1:2,]

#������ �ǽ�
hours=c(3,7,6,9,4,2)
scores=c(50,80,60,75,70,55)
plot(x =hours, y= scores)
g = lm(scores~hours)
g
abline(g)
