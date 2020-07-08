try:
    a = int(input("a : "))
    b = int(input("b : "))
    c = a / b
    print(c)
except ZeroDivisionError:
    print("error")

else:
    print("OK")