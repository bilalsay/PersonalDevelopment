def topla(*a): # *a -> bu parametre esnek olacak demek , istedigimiz kadar elemani liste olarak aliriz
	toplam = 0	
	for i in a:
		toplam = toplam + i
	return toplam	
		
print(topla(5,4,5,2,2,7,3,8,4,2,5))		

def fonk(**a):
	for i in a:
		print(str(i)+str(a[i]))
		
fonk(a=2,b=3,c=4)		