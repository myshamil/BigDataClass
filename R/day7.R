
library(KoNLP)
#install.packages("KoNLP")

#토픽모델링:주어진 글 -> 주제
#감정분석:주어진 글 -> 감정

#감정어휘사전:good, happy,...bad, sad
#AFINN(-5~+5), lexicon(긍정,부정), EmoLex(즐거움,놀라움,...)

#감정어휘사전패키지
install.packages("tidytext")
library(tidytext)
install.packages("textdata")
library(textdata)
install.packages("tidyverse")
library(tidyverse)

AFINN<-data.frame(get_sentiments("afinn"))
summary(AFINN)
hist(AFINN$value, breaks=20, 
     xlim=c(-6,6), col='blue',xlab="senti score")

get_sentiments("bing")

get_sentiments("nrc")

oplex<-data.frame(get_sentiments("bing"))
table(oplex$sentiment)

emolex<-data.frame(get_sentiments("nrc"))
table(emolex$sentiment)

library(tm)
library(stringr)
library(dplyr)#로드 실패 -> 설치(dplyr) -> 로드
my.text.location<-"papers"
mypaper<-VCorpus(DirSource(my.text.location))
mypaper

mytxt<-c(rep(NA,33))
for(i in 1:33){
  #mytxt[i]<-mypaper[[i]][1] #코퍼스 내용을 확인, 리스트
  #[[1]][1]..., [[2]][1]....,...[[33]][1]
  mytxt[i]<-as.character(mypaper[[i]][1])
}
typeof(mytxt)
mytxt #벡터 : [1], [2], .., [33]

my.df.text<-data_frame(paper.id=1:33, doc=mytxt)
my.df.text

my.df.text.word<-my.df.text %>% unnest_tokens(word, doc)

library(tidyr)

myresult.sa<-my.df.text.word %>% 
  inner_join(get_sentiments("bing")) %>% 
  count(word, paper.id, sentiment) %>% 
  spread(sentiment, n, fill=0)
#%>% : 파이프 오퍼레이터, 오브젝트%>%함수:함수를 오브젝트에 적용해라 
#객체.메서드명(전달값)


# text<-c("How are you",
#         "He is a boy",
#         "She is a girl")
# textDf<-data_frame(line=1:3, text=text)
# 
# textDf %>% unnest_tokens(word, text)


myresult.sa

myagg<-summarise(group_by(myresult.sa, paper.id),
          pos.sum=sum(positive),
          neg.sum=sum(negative),
          pos.sent=pos.sum-neg.sum
          )
myagg



install.packages("textstem")
library(textstem)
x<-c("well", "doggies", "running")
lemmatize_words(x)




library(SnowballC)
install.packages("analogue")
library(analogue)
#readr::read_lines("reuters-train")


# 스크래핑 어려운 사람은 아래 코드로 실습
# data(acq)
# acq[[50]][1]

#감성어휘사전 기반 감성분석 프로젝트
#스크래핑(파이썬, 해외언론사(통신사), 넷플릭스..영화줄거리)
#-> txt형식으로 저장
#-> 전처리 -> 감성분석 -> 결과출력





