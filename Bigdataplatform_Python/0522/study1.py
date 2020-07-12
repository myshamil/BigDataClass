#리스트
colors = ['red', 'green', 'gold']
print(colors)
#기존의 리스트에 값 추가하기
colors.append('blue')
print(colors)
print()
#원하는 위치에 값 넣기
colors.insert(1,'black')
print(colors)
print()
#한번에 여러값
colors.extend(['white','gray'])
print(colors)
print()
# 연산자 지원
colors += ['red']
print(colors)
colors += 'red'
print(colors)
print()
#값이 어디에 있는지
print(colors.index('red'))
print(colors.index('red',1)) #두번째 인자는 시작점을 명시함, 세번쨰 인자로 종결점 지정
#print(colors.index('red',1,5))  # 원하는 값이 없으면 에러발생
print()
#count 현재 해당 값의 개수를 반환 count()
#값을 뽑아내는 pop() 인자 생략시 쥐에서 값을 뽑아내고, 원하는 위치를 인자로 줄 수 있음.
#pop되면 해당 값은 리스트 상에서 사라짐
print(colors.count('red'))
print(colors.pop())
print(colors.pop())
print(colors.pop(1))
print(colors)
print()

#remove() 단순하게 해당값을 삭제. 동일한 값이 2개면 앞쪽 먼저 삭제
#순방향 정렬 sort() 역방향 정렬 reverse()
#sort() 에서는 원하는 방식 지정 가능 리버스 여부 지정 가능. 
#mysort() 마지막 문자를 기분으로 비교를 수행
colors.sort()
print(colors)
colors.reverse
print(colors)
print()
def mysort(x):
    return x[-1]
colors.sort(key=mysort)
print(colors)
colors.sort(key=mysort, reverse=True)
print(colors)