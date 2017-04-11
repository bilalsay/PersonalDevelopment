#include <stdio.h>

int main() {
	int girilen = 0;
	int ort;
	int n = 0;
	int toplam = 0;
	while (girilen != -1) {
		scanf("%d", &girilen);
		n++;
		toplam += girilen;
	}
	toplam++;
	n--;	
	printf("Şuanki ortalama: %d\n", toplam/n);
}
