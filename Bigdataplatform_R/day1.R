print("hello world")
# R = Python, Numpy, Pandas, Matplotlib
# ���� ����

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
# R���� -�� index��ȣ�� �ƴ�, �����ϴ� method
f[-1] #"grape"  "orange"
f[-2] #"apple"  "orange"
f
f[-3] #"apple" "grape"
f[TRUE, TRUE, FALSE] #Error in f[TRUE, TRUE, FALSE] : incorrect number of dimensions
f[c(TRUE, TRUE, FALSE)] # c�Լ��� ��� ��� 
#Category, factor method
gender=factor(c("F", "M", "M"))
gender # [1] F M M / Levels: F M
blood<-factor(c('O','AB','A'))
blood

blood<-factor(c('O','AB','A'), levels=c("O","AB","A","B")) #level�� ���� �˷��ش�
blood 


hakjum<-factor(c("C","A","B","F"), levels =c("A","B","c","D","f"),ordered=TRUE)
#������������ ���� ordered =TRUE
#R�� ��ҹ��� �����Ѵ�. 
hakjum

#����Ʈ : ���� ���� ����

f[1]
n[1]
s[1]


mylist=list(myf=f[1], myn=n[1], mys=s[1])
mylist         
typeof(mylist)
mylist
mylist$myn
mylist[2]#����Ʈ�� ��ҿ� �����ҋ� ���Ʒ� �Ѵ� ����
mylist[[2]] #�� ���� ��Ұ��� ����. 


data.frame{base} #�߰�ȣ...base ��Ű�� �ȿ� �ֱ���~

df<-data.frame(f,n,s) #������ ������ ������������ ����
df
typeof(df)
str(df)


matrix(c(1,2,3,4,5,6),nrow=2) #��� nrow ���� ���� ��������
m<-matrix(c(1,2,3,4,5,6),ncol=2) #ncol ���� ���� ��������
m[1,2]
m[1,]
m[,2]

usedcars<-read.csv("usedcars.csv", stringsAsFactors =TRUE )
usedcars
str(usedcars)




















