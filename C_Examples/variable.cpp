#include <stdio.h>

int main() {
	int a = 10;
	int b = 3, c = 4;
	int d;
	printf("a: %d, b:%d, c:%d\n", a, b, c);
	
	printf("Bir sayı giriniz: ");
	scanf("%d", &d);
	printf("\nGirilen sayı: %d", d);
	
	float pi = 3.14;
	printf("\nFloat değer: %8.4f", pi); /* toplam 8 karakter nokta ve noktadan önce 4 noktadan sonra 4 karakter şeklinde formatla */
	return 0;
}
