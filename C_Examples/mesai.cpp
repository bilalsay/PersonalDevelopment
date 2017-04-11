#include <stdio.h>

int main() {
	int mesai;
	printf("Lütfen mesai saatinizi giriniz");
	scanf("%d", &mesai);
	if (mesai <= 10) {
		printf("Ücret = %d", mesai*5);
	} else if (mesai <= 20) {
		printf("Ücret= %d", 50 + (mesai - 10) * 3);
	} else {
		printf("Ücret= %d", 80 + (mesai - 20) * 2);
	}
	
}
