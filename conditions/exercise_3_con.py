weight = float(input('Enter your weight: '))
height = float(input('Enter your height: '))

ideal_weight = height - 100
compare = weight - ideal_weight
print(compare)

if compare <= -5:
    print('Super Slim')
elif compare >= -5:
    print('Slim')
elif compare > 5:
    print('Fat')