t=int(input())
while(t>0):
    t-=1
    n=int(input())
    if(n&(n-1)==0):
        print("True")
    else:
        print("False")