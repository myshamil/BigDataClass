data(acq)
basetxt<-c(rep(NA,50))
for(i in 1:50){
    acq[[i]][1]<-str_replace_all(acq[[i]][1], '\n',' ')
    acq[[i]][1]<-str_replace_all(acq[[i]][1], '[[:space:]]{1,}',' ')
    basetxt[i] <- as.character(acq[[i]][1]) 
}
typeof(basetxt)
basetxt
baseDf<-data_frame(paper.id=1:50, doc=basetxt)
baseDf
baseDf.word<-baseDf %>% unnest_tokens(word, doc)

myresult<-baseDf.word %>% inner_join(get_sentiments("bing")) %>% 
    count(word, paper.id, sentiment) %>% 
    spread(sentiment, n, fill=0)

myagg1<-summarise(group_by(myresult, paper.id),
                  pos.sum=sum(positive),
                  neg.sum=sum(negative),
                  pos.sent=pos.sum-neg.sum)
myagg1
#############################################################################
install.packages("rvest")
install.packages("dplyr")
install.packages("tidyverse")
library(rvest)
library(dplyr)
library(tidytext)
library(textdata)
library(tidyverse)
library(tm)
library(stringr)
library(dplyr)
library(tidyr)
library(textstem)
url<-"https://news.google.com/topstories?hl=en-US&gl=US&ceid=US:en"
html<-read_html(url)
html
html2<-html_nodes(html, '.DY5T1d') %>% html_text()
html2
typeof(html2)
text_news<-data_frame(id=1:55, text=html2)
text_news.df<- text_news %>% unnest_tokens(word, text)
text_news.df
result_news<-text_news.df %>% inner_join((get_sentiments("bing"))) %>% count(word, id, sentiment) %>% spread(sentiment, n, fill=0)
result_news
myagg_news<-summarise(group_by(result_news,id),pos.sum=sum(positive),neg.sum=sum(negative),pos.sent=pos.sum-neg.sum)
myagg_news
plot(myagg_news$pos.sum, myagg_news$neg.sum)
myagg_news$color[myagg_news$pos.sent>=1]='blue'
myagg_news$color[myagg_news$pos.sent<=-1]='red'
myagg_news$color[myagg_news$pos.sent==0]='yellow'
plot(myagg_news$pos.sent, col=myagg_news$color)
myagg_news
pie(table(myagg_news$color))