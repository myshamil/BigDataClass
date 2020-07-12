smsraw<-read.csv("sms_spam_ansi.txt",
         stringsAsFactors = FALSE)
str(smsraw)
smsraw$type<-factor(smsraw$type)
str(smsraw)
table(smsraw$type)

library(tm)
smsCorpus<-VCorpus(VectorSource(smsraw$text))
smsCorpus
inspect(smsCorpus[1])

smsCorpus[[1]]$content
as.character(smsCorpus[[1]])
lapply(smsCorpus[1], as.character)

#텍스트전처리 패키지:tm, 함수:tm_map(코퍼스 전체에 대한 변환)

#코퍼스에 있는 모든 단어를 소문자로 변환
corpusClean<-tm_map(smsCorpus, content_transformer(tolower))
#tm_map(코퍼스변수, content_transformer(변환함수))
corpusClean[[1]]$content
#smsCorpus[[1]]$content

#코퍼스에 있는 모든 숫자를 제거
corpusClean<-tm_map(corpusClean, content_transformer(removeNumbers))
corpusClean[[4]]$content
smsCorpus[[4]]$content

#removeNumbers 와 같은 몇몇 함수들은 내부적으로
#content_transformer를 포함하고 있음.
corpusClean<-tm_map(corpusClean, removeNumbers)
corpusClean[[4]]$content

#stopwords(불용어) 제거
stopwords()

corpusClean<-tm_map(corpusClean, removeWords,stopwords())
#x<-c("they", "i", "you")  불용어 사전 정의
#tm_map(corpusClean, removeWords,x)

corpusClean[[4]]$content
corpusClean<-tm_map(corpusClean, removePunctuation)
corpusClean[[4]]$content

corpusClean[[2]]$content

#r의 구버전에서는 hello.......world => hello......world
removePunctuation("hello.......world")

myRemPunc<-function(x){
  #gsub(패턴식,치환,x)
  gsub("[[:punct:]]+"," ",x)#점 7개가 공백문자 1개로 치환
}
myRemPunc("hello.......world")

#어근 형태로 변환
library(SnowballC)
wordStem(c("learn","learned","learning","learns"))


corpusClean[[2]]$content
corpusClean<-tm_map(corpusClean, stemDocument)
corpusClean[[2]]$content








