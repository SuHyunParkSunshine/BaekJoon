# Dictionary 사용

from sys import stdin

_ = stdin.readline() # 입력 값을 무시 -> 여기서 필요하지 않음
card = list(map(int, stdin.readline().split()))
_ = stdin.readline()
candidate = list(map(int, stdin.readline().split()))

cardDic = dict()

for c in card:
    if c in cardDic:
        cardDic[c] += 1
    else:
        cardDic[c] = 1

print(' '.join(str(cardDic[m]) if m in cardDic else '0' for m in candidate))