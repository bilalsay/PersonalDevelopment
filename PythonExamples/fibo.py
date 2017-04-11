def fib(n):
	if (n < 2):
		return n
	return fib(n-2)+fib(n-1) 
	
def printFibSeri(n):
	l = []
	i = 0
	while i <= n:
		l.append(fib(i))
		i = i + 1
	print(l)		 
    