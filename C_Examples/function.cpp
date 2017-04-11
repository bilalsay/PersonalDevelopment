#include <stdio.h>

int fact(int);

int main() {
	printf("Bir sayı giriniz");
	int number;
	scanf("%d", &number);
	printf("Fact Fonksiyonunun çıktısı: %d", fact(number));
}

int fact(int x) {
	int result = 1;
	for (int i = 1; i <= x; i++) {
		result *= i;
	}
	return result;
}

