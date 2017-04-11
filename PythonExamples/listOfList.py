l = [1,2,3]
m = [[6,4,5], [5,7,9], l]
print(m)
transposMatrix = [[row[i] for row in m] for i in range(3)]
print(transposMatrix)
del(m[1][1])
print(m)