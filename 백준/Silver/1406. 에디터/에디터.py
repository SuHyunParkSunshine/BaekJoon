import sys

leftStk = list(sys.stdin.readline().rstrip())
rightStk = []

for _ in range(int(sys.stdin.readline())):
    command = list(sys.stdin.readline().split())
    c = command[0]

    if(c == 'L'):
        if leftStk: # leftStk이 비어 있지 않을때
            rightStk.append(leftStk.pop())

    elif(c == 'D'):
        if rightStk:
            leftStk.append(rightStk.pop())

    elif(c == 'B'):
        if leftStk:
            leftStk.pop()

    elif(c == 'P'):
        letter = command[1].lstrip()
        leftStk.append(letter)

leftStk.extend(reversed(rightStk))
print(''.join(leftStk), end='')