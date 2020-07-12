import requests
from bs4 import BeautifulSoup
import os
import cx_Oracle
import time

res = requests.get("https://movie.naver.com/movie/sdb/rank/rmovie.nhn")
soup = BeautifulSoup(res.content, 'lxml')
rankings = soup.find_all('table', class_="list_ranking")
movies = rankings[0].find_all('div', class_="tit3")
for movie in movies:
    m = movie.find('a')
    print(m.get_text(), m['href'])

DB_ID = "scott"
DB_PWD = "1234"
DB_URL = "localhost/company"

def get_conn():
    os.putenv("NVL_LANG", ".UTF8")
    conn = cx_Oracle.connect(DB_ID,DB_PWD,DB_URL)
    return conn

def insert_row(conn, id, name, link):
    cursor = conn.cursor()
    str_sql = "INSERT INTO DEPT VALUES(:id, :name, :link)"
    cursor.execute(str_sql, \
        {'id': id, 'name': name, 'link':link})
    conn.commit()
    cursor.close()


id = int(input("번호를 입력해주세요.: "))
name = input("영화제목을 입력해주세요.: ")
link = int(input("링크 입력해주세요.: "))
conn =  get_conn()
insert_row(conn, id, name, link)
conn.close()