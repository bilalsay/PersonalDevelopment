l = [1,2,3,3,2,2,2] # liste
t = (1,2,3) # kayit
k = {1,2,3,3,2,2,2} # kume - bir eleman bir kere olur

print(l)
print(t)
print(k)

k2 = set(l)
k3 = set([1,111,1,1,1,1])
print(k2)
print(k3)

k4 = set("bilalsay")
k5 = set("statoz")
print(k4)
print(k5)

print(k4|k5) # set union
print(k4-k5) # set difference
print(k4&k5) # set intersection
print(k4^k5) # exclusive or - iki yonlu kume farkı birlesimi