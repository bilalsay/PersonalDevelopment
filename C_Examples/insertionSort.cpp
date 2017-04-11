#include <stdio.h>

int * insertionSort(int *, int);

int main() {
	int list[] = {33,44,21,83,56,73,22};

	int listLength = (int)(sizeof(list) / sizeof(*list));
	
	int *sortedList =  insertionSort(list, listLength - 1);
	int sortedListLength = ((int)sizeof(sortedList)) - 1;
	for (int i = 0; i < sortedListLength; i++)
		printf("%d ", sortedList[i]);
	return 0;
}

int * insertionSort(int list[], int point) {
	
	if (point > 0) {
		list = insertionSort(list, point - 1);	
	
		int temp;
		for (int i = point; i > 0; i--) {
			if (list[i] < list[i - 1]) {
				temp = list[i];
				list[i] = list[i - 1];
				list[i - 1] = temp;
			
			}
		}
	}
	return list;
	
}
