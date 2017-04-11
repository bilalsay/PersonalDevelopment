#include <stdio.h>

int * iterInsertSort(int *);

int main() {
	int unSortedList[] = {33,44,21,83,56,73,22};
	int * sortedList = iterInsertSort(unSortedList);
	for (int i = 0; i < sizeof(sortedList); i++)
		printf("%d  ", sortedList[i]);	
	

}

int * iterInsertSort(int * list) {
	for (int i = 1; i < sizeof(list) - 1; i++) {
		int valueToInsert = list[i];
		int position = i;
		while (position > 0 && list[position - 1] > valueToInsert) {
			list[position] = list[position - 1];
			position--;
		}
		list[position] = valueToInsert;
	}	
	
	return list;
}
