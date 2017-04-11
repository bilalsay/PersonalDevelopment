l = [2,4,5,6]
l.append(4)
print(l)
l.insert(3, 666)
print(l)
l.remove(4)
print(l)
print(l.pop())
print(l)
print(l.index(666))
print(l.count(2))
l.sort()
print(l)
l2 = [444,555,7878]
l.extend(l2)
print(l)
l.append(l2)
print(l)
l.clear()
print(l)

# sig copy de sadece pointer i degisken atıyoruz ikisi de memory de aynı pointer e isaret ediyor
l3 = l2
print(l3)
l3.append(2234)
print(l2)
print(l3)

# derin copy de iki farkli list oluyor memory de

l4 = l2.copy()
l4.append(877)
print(l2)
print(l4)