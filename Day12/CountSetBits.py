t=int(input())
while(t>0):
    t-=1
    c=0;
    n=int(input())
    while(n!=0):
        if(n&1):
            c+=1
        n=n>>1
    print(c)