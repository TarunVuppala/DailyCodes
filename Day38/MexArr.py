# https://www.codechef.com/START128D/problems/MEXARR
t = int(input())
for i in range(t):
    n = int(input())
    l = list(map(int, input().split()))
    l.sort()
    c = 0
    for i in range(n):
        c += abs(i-l[i])
    print(c)
