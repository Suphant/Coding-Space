import pandas as pd
df = pd.DataFrame({'Name': ['Alice', 'Bob', 'Jack', 'John', 'Ben'],

'Score': [80.5, 85.6, 70, 65.4, 55],
'Grade': ['A', 'A', 'B+', 'C+', None],
'StdID': [10, 20, 30, 40, 50]})

# Create the index
index_ = ['Row_1', 'Row_2', 'Row_3', 'Row_4', 'Row_5']
# Set the index
df.index = index_