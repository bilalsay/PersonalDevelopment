#include <stdio.h>

int deleteMin(int[], int);

int main() {
	int h[] = {0, 2,4,3,7,5,8,9,11,9,6,10};		
	int n = 11;
	printf("%d", deleteMin(h, n));
}

int deleteMin(int h[], int n) {
	if (n <= 0)
		return -1;
	int minKey = h[1];
	h[1] = h[n];
	n = n - 1;
	if (n <= 0)
		return minKey;

	int node = 1;
	while(1) {
		int left = 2 * node;
		int right = (2 * node) + 1;
		int smallest = node;
		if (left <= n && h[left] < h[smallest])
			smallest = left;
		if (right <= n && h[right] < h[smallest])
			smallest = right;
		if (smallest == node)
			return minKey;
		int temp = h[node];
		h[node] = h[smallest];
		h[smallest] = temp;
		node = smallest;
	}
}
