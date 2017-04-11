#include <stdio.h>

void quickSort(int[], int, int);
int partition(int[], int, int);
 
int main() {
	int list[] = {565,5,7,2,100,6,999,4,7};
	quickSort(list, 0, 8);
	for (int i = 0; i < 9; i++)
		printf("%d ", list[i]);

}


void quickSort(int list[], int leftPoint, int rightPoint) {
	
	int pivot;
	if (leftPoint < rightPoint) {
		pivot = partition(list, leftPoint, rightPoint);
		quickSort(list, leftPoint, pivot - 1);
		quickSort(list, pivot + 1, rightPoint);	
	}
}

int partition(int list[], int leftPoint, int rightPoint) {

	int temp;
    	int numberOfRightPoint = list[rightPoint];
    	int i = leftPoint - 1;

    	for( ; leftPoint <= rightPoint - 1; leftPoint++) {
        	if(list[leftPoint] <= numberOfRightPoint) {
            		i++;
            		temp = list[i];
         	        list[i] = list[leftPoint];
          	        list[leftPoint] = temp;
        	}
    	}
    	temp = list[i+1];
    	list[i+1] = list[rightPoint];
    	list[rightPoint] = temp;
    	return i+1;

}
