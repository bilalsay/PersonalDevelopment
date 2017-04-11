#include <stdio.h>

int main() {
	printf("Bu günün tarihini giriniz");
	int bugun, dogumTarihi;
	scanf("%d", &bugun);
	printf("Doğum tarihinizi giriniz");
	scanf("%d", &dogumTarihi);
	printf("Yaşınız: %d", bugun - dogumTarihi);

}
