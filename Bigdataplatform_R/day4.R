install.packages("arules")
library(arules) #기능 보완을 위해 read.transactions 사용하기 위해(아이템 자동정렬되는듯?)

groceries<-read.transactions("groceries.csv", sep=",",header = FALSE)
View(groceries)
summary(groceries)
#9835 rows (elements/itemsets/transactions) and 거래건수
#169 columns (items) and a density of 0.02609146 상품종류개수
# density of 0.02609146 : 밀도: 행열에서 0ㅇ이 아닌 셀의 비율 
#희소행렬
print(9835*169*0.026)
#결과 43214.99 <-이정도의 셀이 0이 아님
#한달 동안 총 43000여개의 아이템이 판매
#most frequent items:
#whole milk other vegetables       rolls/buns             soda           yogurt          (Other) 
#2513             1903             1809             1715             1372            34055 
#각각의 항목이 포함된 거래건수 


inspect(groceries[1:5]) #데이터가 잘 읽어졌느지 확인 할때

inspect(groceries[1:5,1:3])
itemFrequency(groceries[,1:3]) #1번째 열부터 3번쨰 열
#지지도 (support): 전체 거래 중 해당 아이템 거래 비율

itemFrequencyPlot(groceries, support=0.1)
#지지도 0.1 이상인 상품 시각화

image(groceries[1:5]) #희소행렬을 보여줌
image(groceries[1:100])

#169 종류의 상품
#2의 169승 -1 => 아이템 항목집합

#전체 연관규칙 중에서 향상도가 가장높은 연관규칙 10개를 뽁아라


#A(설탕) 구매건수 :0번
#pruning: A-B , AB->C ...A가 들어가는 모든 규칙 제거


groceryrules<-apriori(groceries, parameter = list(
  support = 0.005, confidence=0.2, minlen=2
  
)) #리스트 함수로 준다
#set of 872 rules 

summary(groceryrules)
inspect(groceryrules[1:3])
# lhs           rhs                support     confidence coverage   lift     count
#{cake bar} => {whole milk}       0.005592272 0.4230769  0.01321810 1.655775 55   
#{dishes}   => {other vegetables} 0.005998983 0.3410405  0.01759024 1.762550 59   
#{dishes}   => {whole milk}       0.005287239 0.3005780  0.01759024 1.176357 52

inspect(sort(groceryrules, by='lift')[1:15])
herbrulues<-subset(groceryrules, items %in% "herbs") #허브가 들어간 규칙을 전부 찾아
inspect(herbrulues)

berries_rules<-subset(groceryrules, items %in% "berries")
berries_rules
write(groceryrules, file ="myrules.csv", sep= ",", row.names=FALSE)
df<-as(groceryrules,"data.frame")
str(df)

data(Epub)
help(Epub)

summary(Epub)
#15729 rows (elements/itemsets/transactions) and
#936 columns (items) and a density of 0.001758755 
#15729*936*0.01758755

#연관규칙 연습
#support,confidence, minlen=2
#sort(by=기준열이름)
