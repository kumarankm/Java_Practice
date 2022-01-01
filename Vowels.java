n = int(input())
global count
count = 1
for p in range(n):
    i,j = input().split(",")
    ar = []
    for y in range(int(i)):
        a = []
        for x in range(int(j)):
            a.append(count)
            count += 1
        ar.append(a)
    print(ar)
        
