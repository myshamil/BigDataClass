file = open("file.txt", "w")
for i in range(1,6):
    data= "Hello Python.\n"
    file.write(data)
print("writed")
print(file.name)
file.close()

file2 = open("file.txt", "r")
while True:
    msg = file2.readline()
    if not msg: break #""
    print(msg)