keep_grade = []
keep_credit = []
total_credit = 0
toal_gradeXcredit = 0
for i in range(5):
    grade = input('Enter Grade: ')
    keep_grade[i] = grade
    credit = float(input('Enter credit: '))
    if grade == 'A':
        grade_num = 4
    if grade == 'B':
        grade_num = 3
    if grade == 'C':
        grade_num = 2
    if grade == 'D':
        grade_num = 1
    if grade == 'F':
        grade_num = 0
    toal_gradeXcredit += float(grade_num)*credit
    total_credit += credit
    gpa = toal_gradeXcredit/total_credit
print(f'GPA = {gpa}')