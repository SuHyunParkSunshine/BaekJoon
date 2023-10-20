from sys import stdin

val = list(map(int, stdin.readline().split()))

N = val[0]
M = val[1]

tree = sorted(list(map(int, stdin.readline().split())))

min = 0
max = 0

max = tree[N-1]

while(min < max):
    mid = (max + min) // 2
    sum = 0

    for treeHeight in tree:
        cutTree = treeHeight - mid
        
        if(cutTree > 0):
            sum += cutTree
    
    if(sum < M):
        max = mid
    else:
        min = mid + 1

print(min - 1)
