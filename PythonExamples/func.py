def f(x):
	return x + 10

print(f(8))	

def selam(isim):
	print("Selam "+str(isim))
	
selam("bilal")	

def fib(n):
	a,b = 0,1
	while a < n:
		print(a)
		a,b = b, a+b
		
fib(33)		

def fact(n):
	a = 1
	sonuc = 1
	while a <= n:
		sonuc = a * sonuc
		a = a + 1
	return sonuc

print(fact(5))	

def factR(n):
	if (n == 0):
		return 1
	return n * factR(n-1)

print(factR(5))		


def fibo(n):
	if (n < 2):
		return n
	return fibo(n-2)+fibo(n-1)
	
a = 0	
while a < 9:
	print(fibo(a))
	a = a + 1	  		





		