l = [1,2,39,5,3]
toplam = 0
for i in l:
	toplam = toplam + i
	print(i)
print(toplam)	


for i in range(5):
	print(i)
	
for i in range(2, 20, 3):
	print(i)
	
l2 = range(5)
print(l2)
	
for i in range(1,20):
	if (i%3 == 0):
		continue
	print(i)		

# asal sayilari bulma yontem 1
	
flag = False	
for i in range(1,100):
	for j in range(2,i):
		if (i%j == 0):
			flag = True
			break
			
	if (flag != True):
		print(i)
			
# asal sayilari bulma yontem 2
	
sonuc = []	
for i in range(1,100):
	for j in range(2,i):
		if (i%j == 0):
			break
			
	else:# bu else for un seviyesinde eger dongunun icindeki if tum dongu boyunca
			# gerceklesmemisse bu else yi yap
		sonuc.append(i)			
			
print(sonuc)			
			
				
	
	