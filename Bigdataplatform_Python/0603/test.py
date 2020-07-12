import numpy as np 
import pandas as pd 
#BMI지수 = 몸무게 (kg) / 신장(m) x 신장(m))
data = pd.read_csv("C:\\python_Pjt\\student.csv")
print(data)
print(data['weight']/data['height'])
filter = data['sex'] == 'male'
df_male =data[filter]
print(df_male)
filter2 = data['sex']=='female'
df_female = data[filter2]
print(df_female)
data['bmi']= 2*2*10
print(data)
data['bmi'].mean()
