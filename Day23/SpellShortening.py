t=int (input())
while(t>0):
    t-=1
    a=int(input())
    b=input()
    for i in range(a-1):
        if(b[i]>b[i+1]):
            r=b[:i]+b[i+1:]
            break
    else:
        r=b[:-1]
    print (r)