# def test(a):
#     return a +10
# print(test(2))
# b= test
# print(id(b), type(b), id(test), type(test))
# print(b(3))

# f = lambda a :a+10
# print(f(2))
# f2 = lambda a , b:a+b
# print(f(2))
# f2 = lambda a , b:a+b
# print(f2(1,2))

# def t(n):
#     return lambda a:a*n

# n= int(input("단수를 입력해주세요. : "))
# b = t(n)
# for i in range(1,10):
#     print(n, "x", i, "=", b(i))

list1 = {1,2,3,4,10,123,22}
odd = list(filter(lambda x: (x%3==0),list1)) #filter메소드 
print(odd)

list2 = list(map(lambda  x:x*x,list1))
print(list2)