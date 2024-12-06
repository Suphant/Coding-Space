n1 = int(input('Input num1: '))
n2 = int(input('Input num2: '))
n3 = int(input('Input num3: '))

winner = n1
if n2 < n1:
    winner = n2

if winner > n3:
    winner = n3

print('Smallest value from three numbers is', winner)