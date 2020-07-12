print("hello world")
# R = Python, Numpy, Pandas, Matplotlib
# 벡터 존재

f = c('apple', 'grape', 'orange') #method c = making vectors
f
typeof(f)
n = c(3,2,5)
n
s = c(TRUE, FALSE, FALSE) 
f[0] #character(0)
f[1] #"apple"
f[1:3] #"apple"  "grape"  "orange"
f[1:4] #"apple"  "grape"  "orange" NA 
# R에서 -는 index번호가 아닌, 제외하는 method
f[-1] #"grape"  "orange"
f[-2] #"apple"  "orange"
f
f[-3] #"apple" "grape"
f[TRUE, TRUE, FALSE] #Error in f[TRUE, TRUE, FALSE] : incorrect number of dimensions
f[c(TRUE, TRUE, FALSE)] # c함수로 묶어서 사용 
#Category, factor method
gender=factor(c("F", "M", "M"))
gender # [1] F M M / Levels: F M
blood<-factor(c('O','AB','A'))
blood

blood<-factor(c('O','AB','A'), levels=c("O","AB","A","B")) #level을 직접 알려준다
blood 


hakjum<-factor(c("C","A","B","F"), levels =c("A","B","c","D","f"),ordered=TRUE)
#오름차순으로 나열 ordered =TRUE
#R은 대소문자 구분한다. 
hakjum

#리스트 : 순서 집합 저장

f[1]
n[1]
s[1]


mylist=list(myf=f[1], myn=n[1], mys=s[1])
mylist         
typeof(mylist)
mylist
mylist$myn
mylist[2]#리스트의 요소에 접근할떄 위아래 둘다 가능
mylist[[2]] #그 안의 요소값이 등장. 


data.frame{base} #중괄호...base 패키지 안에 있구나~

df<-data.frame(f,n,s) #열벡터 세개로 데이터프레임 생성
df
typeof(df)
str(df)


matrix(c(1,2,3,4,5,6),nrow=2) #행렬 nrow 행의 갯수 설정가능
m<-matrix(c(1,2,3,4,5,6),ncol=2) #ncol 열의 갯수 설정가능
m[1,2]
m[1,]
m[,2]

usedcars<-read.csv("usedcars.csv", stringsAsFactors =TRUE )
usedcars
str(usedcars)





















