# Counter 사용
from sys import stdin
from collections import Counter

N = stdin.readline()
card = list(map(int, stdin.readline().split(' ')))
M = stdin.readline()
candidate = list(map(int, stdin.readline().split(' ')))

# Counter는 빈도수를 딕셔너리 형태로 만듦
feqCard = Counter(card)

for can in candidate:
    if can in feqCard:
        print(feqCard[can], end=' ')
    else:
        print(0, end=' ')