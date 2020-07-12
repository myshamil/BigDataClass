# class Employee5:
#     empCount = 0
#     def __init__(self,name,salary):
#         self.name = name
#         self.salary = salary
#         Employee5.empCount += 1
#     def displayCount(self):
#         print("Employee %d" % Employee5.empCount)

#     def displayEmployee(self):
#         print("name : ", self.name, ", salary : ", self.salary)
# emp1 = Employee5("이순신", 2000)
# emp1.displayCount()
# emp1.displayEmployee()
# emp2 = Employee5("강감찬", 3000)
# emp2.displayCount()
# emp2.displayEmployee()
# print(Employee5.__dict__)

# class Animal:
#     def breath(self):
#         print("Animal breathing")
    
# class Dog(Animal):
#     def bark(self):
#         print("Dog barking")
#     def breath(self): #overriding
#         print("Dog breathing")

# d = Dog()
# d.bark()
# d.breath()
# a = Animal()
# a.eat(name="강아지2")
# a.eat("강아지3", 50)

# class MyData: #__private declare
#     __c = 10
#     def __init__(self,a,b,c):
#         self.a = a
#         self.b = b
#         self.__c = c
#     def displayData(self):
#         print(self.a, self.b)
#     def __displayData2(self):
#         print("Nothing")
#     def __del__(self):
#         print("Delete")
# myData = MyData(1,2,3)
# print(myData.a)
# # print(myData.__c)

class Calc1:
    def Add(self, a, b):
        return a + b
class Calc2:
    def mul(self, a, b):
        return a * b
class Calc3(Calc1, Calc2):
    def div(self, a, b):
        return a / b

c= Calc3()
print(c.Add(1,2))
print(c.mul(3,2))
print(c.div(4,2))