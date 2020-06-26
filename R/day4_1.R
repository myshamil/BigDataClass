#Apriori 는 transaction type 이어야 한다. 
#apriori(data, parameter = NULL, appearance = NULL, control = NULL)
grocery_rules<-apriori(groceries, parameter=list(
  support=0.005, confidence=0.2, minlen=2
)) #[872 rule(s)] 872개의 규칙 형성. minlen= 최소 길이가 2개 이상이어야한다.(조건)
summary(grocery_rules)
#X(lhs) ->Y(rhs)연관규칙 
#{apple}->{water, banana} : conf0.7 사과를 구매한 사람중 70% 물과 바나나 구매
# 872를 구성하는 각각의 아이템의 갯수 2:265, 3:559, 4:48
inspect(grocery_rules[1:3]) # 연관규칙이 있는 상품 목록 뽑아보자 
#lhs               rhs                support     confidence coverage   lift     count
#[1] {cake bar} => {whole milk}       0.005592272 0.4230769  0.01321810 1.655775 55   
#[2] {dishes}   => {other vegetables} 0.005998983 0.3410405  0.01759024 1.762550 59   
#[3] {dishes}   => {whole milk}       0.005287239 0.3005780  0.01759024 1.176357 52  
inspect(sort(grocery_rules, by='lift')[1:15])
# 연관규칙이 있는 상품 목록은 lift기준으로 sort해서 1:15까지 뽑아보자 
#예상치 못한 것들이 나올 수 있다 (데이터 속에 숨어있는 insight)
#butter를 전략 상품으로 판매를 하려고 한다. 
subset() # 부분집합을 만들겠다~ 현재 전체집합은 grocery_rules
herbs_rules<-subset(grocery_rules, items %in% "herbs")
herbs_rules # set of 3 rules  연관규칙 3개 
inspect(herbs_rules)
berries_rules<-subset(grocery_rules, items %in% "berries")
berries_rules # set of 6 rules  연관규칙 6개 
inspect(berries_rules) 
#저장해보자
write(grocery_rules, file="myRules.csv", sep=",",row.names=FALSE)
df<-as(grocery_rules, "data.frame")
str(df)