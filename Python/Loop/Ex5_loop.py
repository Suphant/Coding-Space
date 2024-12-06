n = int(input('Enter number N: '))
total = 0

for i in range(n):
    result = float(input('Enter N number: '))
    total += result
    average = total / n
print(average)