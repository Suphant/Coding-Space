price = float(input('Enter price: '))

if price < 5000:
    print('Discounted amount 5% and the net price', price*(100 - 5)/100, 'to be paid')
elif price < 9999:
    print('Discounted amount 7% and the net price', price*(100 - 7)/100, 'to be paid')
else:
    print('Discounted amount 10% and the net price', price*(100 - 10)/100, 'to be paid')