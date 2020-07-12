a = 10
name = '가나다'
print(name)
b = c = 10 #b와 c에 전부 10을 넣을 수 잇다 multi assignment 가능
print(b)
print(c)
a, b, c= 10, 100, 200 
print(a)
print(b)
print(c)
#기본 타입 standard data type
#Numbers, String, List, Tuple, Dictionary
a = 10
b= 20
c = a+b
d = a*b
e = a/b
print(c)
print(d)
print(e)
print(a,b,c,d,e,)

#문자열에 따옴표 포함시키기
food = "Python's favorite food is perl"
say = '"Python is very easy." he says.'
food1 = 'Python\'s favorite food is perl'
say1  = "\"Python is very easy.\" he says."
print(food)
print(food1)
print(say)
print(say1)

msg3 = "test2"
a1 = 200
a2 = 20.4
print(type(msg3), type(a1), type(a2))

#numbers => int, long, float, complex 

msg1= "hello"
msg2 = "World"
msg3 =  msg1 + msg2
print(msg3)
print(msg3*2)

msg4 = "Nice to meet you"
print(msg4[0])
print(msg4[-1])
print(msg4[0:3]) #([:3]) 같은 의미 안적으면 처음부터~
print(msg4[0:])

print(msg4[1:5])

msg5 = "HELLO"
print(msg5[0])
print(msg5[4])
print(msg5[:])
msg5[0:]
print(msg5[0:1])