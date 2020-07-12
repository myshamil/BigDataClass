class Employee:
    name = "강감찬"
    count = 0
    def __init__(self, name ="nothing"):
        # print(name, self.count)
        Employee.count += 1
        print(Employee.count)
    def display(self, a = 0):
        print(self.count, a)
    def __del__(self):
        print("delete")

class Employee2(Employee):
    def __init__(self):
        print("Employee 생성자")
    def display2(self):
        print("Employee2 display2") 
    def display(self, a = 0, b =1):
        print(a,b)
        

# e = Employee()
# e.display()
# e.display(10)
# e.b=10
# e2 =Employee()
e4 =Employee2()
e4.display()
e4.display2()

