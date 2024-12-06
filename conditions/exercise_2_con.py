name = input('Enter your name: ')
year = float(input('Enter your year birthday(AD): '))

age = 2024 - year

if age <= 19:
    print(name ,'you are Child')
elif age < 55:
    print(name ,'you are adult')
else:
    print(name ,'you are old')

