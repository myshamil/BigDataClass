# str = "Python is happy"
# for word in str:
#     print(word)

# list = ['red','blue','yellow']
# for color in list:
#     print(color)

# tuple = ('red', 'blue', 'yellow')
# for color in tuple:
#     print(color)

# for inx in range(1,10):
#     print(inx)

# for index in range(len(list)):
#     print(list[index])

# data = [(1,2),(3,4),(4,5)]
# for x,y in data:
#     print(x,y)

# l='Hello'
# d=[s for s in l]
# print(d)

# d2 = [(x*2,y*4)for (x,y)in data]
# print(d2)

# def add(a,b,c=0):
#     return a+b+c
# c= add(1,2 )
# c2=add(1,2,3)
# print(c,c2)


# def add(a=0,b=0,c=0):
#     return a+b+c
# c= add(1,2 )
# c2=add(1,2,3)
# print(c,c2)
# print(add(c=30, a=10))

# def msgPrint(str):
#     print(str)
# #리턴이 없는 함수

# #call by reference
# def changeList(list2):
#     list3 = [4,5,6,7]
#     list2.append(list3)
#     print(id(list2),list2)

# list1 = [1,2,3]
# changeList(list1)
# print(id(list1),list1)

def printName(name, *msg):
    print(name)
    print(msg)

printName('강감찬', 1,2)