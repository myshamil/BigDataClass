str = "%10s"% "hi" #포함해서 10자리
print(str)
print(len(str))

str2 = "%-10sjain" % "hi"
print(str2) 
print(len(str2))

str3 = "%10.4f" % 3.42134234
print(str3)
print(len(str3))

str4 = "%0.4f" % 3.42134234
print(str4)
print(len(str4))

str5 ="I am a Korean"
str6 = str5.split()
print(str6)
print(type(str6))

#리스트에 다른 타입을 넣을 수 있다. 
#튜플과 리스트의 차이점?
list1 =["홍길동", 100, 200]
print(list1)
list2 = [1,2,3] 
#리스트는 컨테이너 역할을 한다. 
print(list1[0],list1[1])

str6 = "%s는 %d원과 %d를 가지고 있습니다." % (list1[0], list1[1], list1[2])
print(str6)
list3 = [0,1,2,3,4,5]
print(list3[0:])
print(list3[:])
print(list3[2:4])
print(list3[:4])

#리스트는 값을 바꿀수 있다
list4 = ['자장면', '짬뽕', '탕수육', '볶음밥', '군만두']
print(list4)
list4[0] = '팔보채'
print(list4)

list5 = [1,2, [1,2,3],4,[1,2,]]
print(list5)
print(list5[2])
del list5[0] #삭제 가능
print(list5)
list5[0:1] = [10,11,12]
print(list5)

list6 = [1, [1,2,3],4,[1,2,[1,2,3]]]
print()
print(list6)
print(list6[1],[2])
print(list6[3][2][2])
print(list6[:2])
print(list6[-4:3])
print()
str = "%0.4f" % 3.4533421
print(str)
print(str.split(".")[1])
print(str.split("."))
print()
list7 =[1,2,3,4,6]
for i in list7:
    print(i)

#튜플
tu1 = (100, "홍길동", 20)
print(tu1)
print(tu1[0])
#튜플은 리스트랑 비슷하지만 수정이 안된다. del, 이런거 ㄴㄴ..
#합치는거 곱하는거 가능. 안의 요소를 변경 삭제시 에러 발생

#함수의 표현
def add(a,c):
    return a+c

d = add(1,2)
print(d)
print()
print()


tu2 =(1,2,3,4,5)
print(tu2[0], tu2[0:2])
print()
print()
#ArrayList1 , Dictionary2, ...3 -> class
tu3 = [1,(10,"영업부"),(20,"회계부",300)]
tu4 = (1,(10,20),(30,40,50))
print(tu4)
for i in tu3:
    print(i)