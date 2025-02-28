import csv
file = open('input.txt', 'r')

data = file.readlines()

value_data = []
words = []
words_count = []

for word in data:
    word = word.strip().split('\n')
    if len(word[0]) > 1:
            words.append(word[0])


for line in data:
    line = line.strip().split('!')
    for part in line:
        segment = part.split('?')
        
        for i in segment:
            i = i.split()
            if len(i) >= 3:
                try:
                    if i[2] == '30':
                        value_1 = int(i[2])
                        value_2 = int(i[3])
                        sum = value_1 + value_2
                        value_data.append(sum)
                    if len(i) >= 4:
                        value_1 = int(i[1])
                        value_2 = int(i[3])
                        sum = value_1 + value_2
                        value_data.append(sum)
                    elif len(i) == 3:
                        value_1 = int(i[0])
                        value_2 = int(i[1])
                        value_3 = int(i[2])
                        sum = value_1 + value_2 + value_3
                        value_data.append(sum)
                except:
                    sum = 0
                    value_data.append(sum)
                    #print(f"Can't convert{i}")
                

    
for x in range(len(words)):
    print(f"Line {x + 1}: {words[x]} | Words: | Sum: {value_data[x]}")
print('---------------------------------------------')
print(f"Total lines processed: {len(words)}")
print(f"Total words: {words_count}")
total = 0
for value in value_data:
    total += value
print(f"Total sum of numbers: {total}")

with open('output.txt', 'w', newline='')as file:
    for x in range(len(words)):
        file.write(f"Line {x + 1}: {words[x]} | Words: | Sum: {value_data[x]}\n")
    file.write('---------------------------------------------\n')
    file.write(f"Total lines processed: {len(words)}\n")
    file.write(f"Total words: {words_count}\n")
    total = 0
    for value in value_data:
        total += value
    file.write(f"Total sum of numbers: {total}")




##print(value_data)
#print(words)
#print(len(words))

        

