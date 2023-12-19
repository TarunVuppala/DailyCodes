m,n=map(int,input().split())
a=[list(map(int,input().split())) for i in range(m)]
b=[list(map(int,input().split())) for i in range(m)]

for i in range(m):
    for j in range(n):
        print(str(a[i][j]+b[i][j]),end=' ')
    print()