def calc(x, op, y):
    
    if(op== "+"):
        print("결과는 %d 입니다." %(x+y))
        return
    elif(op== "-"):
        print("결과는 %d 입니다." %(x-y))
        return
    elif(op== "/"):
        print("결과는 %d 입니다." %(x/y))
        return
    elif(op== "*"):
        print("결과는 %d 입니다." %(x*y))
        return

print("########계산기########")
print("######################")
print("    # 1. 덧셈")
print("    # 2. 뺄셈")
print("    # 3. 나눗셈")
print("    # 4. 곱셈")
print("    # 5. 종료")
print("######################")

while True:
    m = int(input("# 원하는 메뉴 선택해주세요. : [1-5] "))

    if(m==1):
        a = int(input("첫번째 숫자를 입력해주세요. : "))
        op = (input("연산자를 입력해주세요. :"))
        b = int(input("두번째 숫자를 입력해주세요. : "))
        calc(a,op,b)
        
    elif(m==2):
        a = int(input("첫번째 숫자를 입력해주세요. : "))
        op = (input("연산자를 입력해주세요. :"))
        b = int(input("두번째 숫자를 입력해주세요. : "))
        calc(a,op,b)
       
    elif(m==3):
        a = int(input("첫번째 숫자를 입력해주세요. : "))
        op = (input("연산자를 입력해주세요. :"))
        b = int(input("두번째 숫자를 입력해주세요. : "))
        calc(a,op,b)

    elif(m==4):
        a = int(input("첫번째 숫자를 입력해주세요. : "))
        op = (input("연산자를 입력해주세요. :"))
        b = int(input("두번째 숫자를 입력해주세요. : "))
        calc(a,op,b)

    elif(m==5):
        print("프로그램을 종료합니다.")
        break
    else:
        print("1~5 중에서 입력해주세요.")
        