#텍스트분석

c(1:6,'a')
list(1:6,'a')

o1<-1:4
o2<-6:10
o3<-list(o1,o2)
myo<-list(o1,o2,o3)
myo

#리스트:[[]], 벡터:[]
myo[[3]][1]  # []:리스트내의 리스트를 추출
myo[[3]][[1]] # [[]]:리스트내의 리스트에 대한 벡터를 추출

myo[[3]][1]

myo#참조하여 9를 출력하는 코드

myo[[3]][[2]][4]


mylist<-list(1:6,'a')
mylist
myvector<-c(1:6,'a')
myvector
unlist(mylist)#리스트 -> 벡터형식 변환
unlist(mylist)==myvector

mean(unlist(mylist)[1:6])

mean(mylist[[1]][1:6])

n1<-"Donald"
ms<-" "
n2<-"Trump"
list(n1,ms,n2)
unlist(list(n1,ms,n2)) #리스트 -> 벡터

n<-c("갑","을","병","정")
gen<-c(2,1,1,2)
df<-data.frame(n,gen)

attr(df$n,"means")<-"이름"
attr(df$gen,"means")<-"성별"
df$n

myvalues<-gen

for (i in 1:length(gen)){ #i는 1부터 4까지 증가
  myvalues[i]<-ifelse(gen[i]==1, "남성", "여성")
}
myvalues

attr(df$gen,"means")   #means:속성명, "성별":속성값

mylist<-list(1:4, 6:10, list(1:4,6:10))

#mean(mylist[1])
mean(mylist[[1]]) #list 내에 있는 벡터에 대한 평균
lapply(mylist[1],mean) #list에 대한 평균

rep(1,4)

s1<-c("earth", "to", "earth")
s1
rep(1,length(s1))

letters[1:26]
letters
LETTERS

tolower("Eye for eye")
toupper("Eye for eye")

nchar("Korea")
nchar("Korea", type='bytes')
nchar("한국")
nchar("한국", type='bytes')

sent<-"Learning R is so interesting"
mywords<-strsplit(sent, split=" ")
strsplit(mywords[[1]][5],split="")

sent2<-"지지자불여호지자 호지자불여락지자"
#아는 사람은 좋아하는 사람만 못하고,
#좋아하는 사람은 즐기는 사람만 못하다
strsplit(sent2, split=" ")


myletters<-list(rep(NA, 5))

for(i in 1:5){
myletters[i]<-strsplit(mywords[[1]][i],split="")
}
myletters

#문자들을 합쳐 단어로 구성
paste(myletters[[1]], collapse = "")
paste(myletters[[1]], collapse = "&")


mywords2<-list(rep(NA,5))
for(i in 1:5){
mywords2[i]<-paste(myletters[[i]], collapse = "")
}
mywords2

paste(mywords2, collapse = " ")

rWiki<-"R is a programming language and free software environment for statistical computing and graphics supported by the R Foundation for Statistical Computing. 
The R language is widely used among statisticians and data miners for developing statistical software and data analysis. 
Polls, data mining surveys, and studies of scholarly literature databases show substantial increases in popularity; as of June 2020, R ranks 9th in the TIOBE index, a measure of popularity of programming languages."
rWikiPara=strsplit(rWiki,split="\n")
#문단 분리 : \n

for(i in 1:3){
print(strsplit(rWikiPara[[1]][i],split=" "))
}

sent
loc.begin<-as.vector(regexpr("ing", sent))
loc.length<-as.vector(attr(regexpr("ing", sent), 'match.length'))
loc.end<-loc.begin+loc.length-1
loc.end

gregexpr("ing", sent) # 6 26
#sent


length(gregexpr("ing", sent)[[1]]) #ing 패턴이 2번 매칭

regexpr("interesting", sent)

regexec("interestin(g)", sent)
sent

regexec("so (interestin(g))", sent)


sub("ing", 'ING', sent)
gsub("ing", 'ING', sent)

#고유명사 처리:여러 단어로 기관명 구성-> _와 같은 기호로 연결=> 하나의 단어 

#singer="가수들 이름"
#gsub("Micheal Jackson", "Micheal_Jackson", singer)

sent

rWikiParaSplit<-list(rep(NA,3))

for(i in 1:3){
  rWikiParaSplit[i]<-strsplit(rWikiPara[[1]][i],split=" ")
}

sent1<-rWikiParaSplit[[1]]
table(sent1)

sum(table(sent1))
sent1
#by 제거
dropSent<-gsub("by|for|the", "", sent1)

strsplit(dropSent, split="")

sent<-c("Learning R is so interesting", 
        "He is a fascinating singer")
#ing로 끝나는 모든 단어
mypat0<-gregexpr("ing", sent)
regmatches(sent, mypat0)

mypat1<-gregexpr("[[:alpha:]]ing", sent)
mypat1
sent

regmatches(sent,mypat1)


mypat1<-gregexpr("[[:alpha:]](ing)", sent)
mypat1
regmatches(sent,mypat1)



mypat1<-gregexpr("[[:upper:]]", sent) #lower
table(unlist(regmatches(sent,mypat1)))

mypat1<-gregexpr("[[:lower:]]", sent) #lower
mytable<-table(unlist(regmatches(sent,mypat1)))

max(mytable)
length(mytable)
sum(mytable)

#코퍼스(corpus, 말뭉치)
#분석 대상 분야에서 사용되는 용어 집합
#ex)인공지능분야 코퍼스 : 머신러닝,파이썬,R,..., 음료수(X)

#자연어처리 : 코퍼스구성
#법률분야 코퍼스 : 범죄, 법, 헌법, ..., 날씨(X)

#조선왕조실록 + 토지 코퍼스 구축

#korean.go.kr

install.packages("stringr")
library(stringr)
mytext<-c("software environment", 
          "software  environment",
          "software\tenvironment")
str_split(mytext, " ")

#strsplit {base}	
#str_split {stringr}


mytext
mytext.nowhitespace<-str_replace_all
(mytext, "[[:space:]]{1,}"," ")

mytext2<-"The 45th President of the United States, Donald Trump, states that he knows how to play trump with the former president"
myword<-unlist(str_extract_all(mytext2, boundary("word")))
table(myword)

myword<-str_replace(myword, "Trump", "Trump_unique_")
myword<-str_replace(myword, "States", "States_unique_")

table(tolower(myword))

mytext<-c("R is the No. 1 stat sw")
str_replace_all(mytext, "[[:digit:]]{1,}[[:space:]]{1,}",
                "_number_ ")

#####################################################
install.packages("tm")
library(tm)
stopwords("en")
stopwords("SMART")

#동일화

#am, are, is, was, were, be => be로 치환
mytext<-c("I am a boy. You are a boy. 
          The person might be a boy. Is Jane a boy?")

my.text.location<-"d:/rwork/papers"
mypaper<-VCorpus(DirSource(my.text.location))
mypaper
summary(mypaper)

#VCorpus:폴더에 있는 모든 텍스트 데이터들을 말뭉치로 구성

mypaper[[2]] #2번째 문서
mypaper[[2]]$content#문서 내의 내용 추출
mypaper[[2]]$meta #메타 데이터 출력
#전화번호:데이터, 색인('김' 입력):메타데이터

meta(mypaper[[2]], tag="author")<-"G. D. Hong"

myfunc<-function(x){
  str_extract_all(x$content,"[[:alnum:]]{1,}[[:punct:]]{1}[[:alnum:]]{1,}")
}
lapply(mypaper, myfunc)

#대문자[[:upper:]]로 시작하는 단어(영문+숫자)를 추출
myfunc<-function(x){
  str_extract_all(x$content,"[[:upper:]]{1}[[:alnum:]]{1,}")
}
lapply(mypaper, myfunc)



mycorpus<-tm_map(mypaper, removeNumbers)
#removeNumbers:숫자를 모두 제거




mypaper[[1]]$content #제거 전

mycorpus[[1]]$content #제거 후

mycorpus<-tm_map(mypaper, removePunctuation)#특수문자 제거
mycorpus[[1]]$content

mycorpus<-tm_map(mycorpus, stripWhitespace)#특수문자 제거
mycorpus[[1]]$content











