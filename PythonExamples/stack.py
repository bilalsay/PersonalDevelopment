from collections import deque
# stack icin list yapisini kullanmak yeterli
l = [2,3,45]
l.append(55)
print(l)
print(l.pop())
print(l)

# queue
l2 = deque([4,6,2,3])
print(l2)
l2.append(77)
print(l2.popleft())
print(l2)