import numpy as np 
import pandas as pd 
#BMI지수 = 몸무게 (kg) / 신장(m) x 신장(m))
data = pd.read_csv("C:\\python_Pjt\\student.csv")

filter1 = data['sex'] == 'male'
filter2 = data['sex']=='female'

w= data['weight']
h= data['height']/100

data['bmi']= w/(h*h)
print(data)

m_bmi = data[filter1]['bmi'].mean()
f_bmi = data[filter2]['bmi'].mean()


print("     ----------남녀 평균 BMI 지수----------")
while True:
    n = int(input("알고 싶은 평균 BMI지수의 성별을 입력해주세요. 남자(1) 여자(2) : "))
    if(n==1):
        print(m_bmi)
    elif (n==2):
        print(f_bmi)
    else:
        print("종료되었습니다.")
        break
        
