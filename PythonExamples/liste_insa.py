l = []
for x in range(1,11):
	l.append(x**2)
	
print(l)	

# map fonksiyonu bir listenin uzerine birinci parametrede belirtilen fonksiyonu uygular
def f(x):
	return x+5
liste = [2,3,4,6,8]
print(list(map(f, liste)))

# yukaridakinin aynisi
newType = list(map(lambda i: i + 5, range(1,11)))
print(newType)

# lambda x: x**2 -> burada inline statement yapiyoruz, onceden bir fonksiyon tanimlamak yerine direk burda tanimliyoz
squares = list(map(lambda x: x**2, range(1,11)))	
print(squares)	

# for ile inline tanimlama yapmak
l3 = [x**2 for x in range(1,11)]
print(l3)

l4 = [(x,y,z,q) for x in range(1,5) for y in range(2,6) for z in range(3,7) for q in range(4,8) if x == (y-1) == (z-2) == (q-3)]
print(l4)
for l in l4:
	print(l)