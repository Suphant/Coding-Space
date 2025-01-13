import numpy as np

a = np.arange(5)
b = []
for i in range(len(a)-1, -1, -1):
    b.append(a[i])

print(a, ' '.join(map(str,b)))