import requests
from bs4 import BeautifulSoup
import os
import cx_Oracle
import time

DB_ID = "scott"
DB_PWD = "1234"
DB_URL = "localhost/company"

def get_conn():
    os.putenv("NVL_LANG", ".UTF8")
    conn = cx_Oracle.connect(DB_ID,DB_PWD,DB_URL)
    return conn

def insert_row(conn, title, link):
    cursor = conn.cursor()
    str_sql = "INSERT INTO MOVIES_RANKS(TITLE,LINK) VALUES(:title, :link)"
    cursor.execute(str_sql, \
        {'title': title, 'link':link})
    conn.commit()
    cursor.close()

def get_all_rows(conn):
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM MOVIES_RANKS")
    for row in cursor:
        print(row)
    cursor.close()
def get_rows_key(conn):
    cursor = conn.cursor()
    str_sql = ("SELECT nvl(max(no),1) FROM MOVIES_RANKS")
    cursor.execute(str_sql)

URL = "http://ticket2.movie.daum.net/Movie/MovieRankList.aspx"

res = requests.get(URL)
soup = BeautifulSoup(res.content,'lxml')
rankings = soup.find_all('strong', class_="tit_join")


for movie in rankings:
    conn =  get_conn()
    m = movie.find('a')
    # print(m.get_text().strip(), m['href'])
    title, link = m.get_text().strip(),m['href']
    insert_row(conn, title, link)
    
print("성공")
