n=int(input())
stack=[]
string=""

for i in range(0,n):
    
    operation=input().split()
    
    if operation[0]=="1":
        stack.append(string)
        string+=operation[1]
    
    elif operation[0]=="2":
        stack.append(string)
        string=string[:len(string)-int(operation[1])]
    
    elif operation[0]=="3":
        print(string[int(operation[1])-1])    
    
    else:
        string=stack.pop()
