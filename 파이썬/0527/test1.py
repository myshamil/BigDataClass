# class Employee:
#     name = "홍길동"
#     age = 20
#     def work(self):
#         print(self.name, self.age)

# emp = Employee()
# emp.work()

# class Student:
#     def __init__(self,name,age):
#         self.name = name
#         self.age = age
#     def study(self):
#         print("name : %s \n age : %d" % (self.name, self.age))
# stu1 = Student("이순신", 30)
# stu1.study()
# stu2 = Student("강감찬", 50)
# stu2.study()

# class student2:
#     count = 0
#     def __init__(self):
#         self.count = self.count +1
#     def displayCount(self):
#         print(self.count)

# stu3 = student2()
# stu3.displayCount()
# stu4 =  student2()
# stu4.displayCount()
# stu5 =  student2()
# stu5.displayCount()

# print("------------------------------")

# class student3:
#     count = 0
#     def __init__(self):
#         student3.count = student3.count +1
#     def displayCount(self):
#         print(student3.count)

# stu6 =  student3()
# stu6.displayCount()        
# stu7 =  student3()
# stu7.displayCount()     
# stu8 =  student3()
# stu8.displayCount()  

# class Student4:
#     def __init__(self):
#         print("생성자")
#     def study(self, name):
#         print(name, "가 공부합니다.")

# stu9 = Student4()
# stu9.study("강감찬 ")

class Student5:
    def __init__(self, name, id, age):
        self.name = name
        self.id = id
        self.age = age

stu10 = Student5("홍길동", 100, 30)
print(getattr(stu10,'name'))
setattr(stu10, 'name', '강감찬')
print(getattr(stu10,'name'))
print(hasattr(stu10, 'name')) #가지고 있는가
print(stu10.name)
delattr(stu10, 'name') ##삭제하기
print(stu10.name)