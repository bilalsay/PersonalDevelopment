#include <stdio.h>

int main() {
	printf("Notunuzu giriniz");
	int nt;
	scanf("%d", &nt);
	
	printf("Harf Notu: ");
	if (nt > 90) {
		printf("AA");
	} else if(nt > 80) {
		printf("BA");
	} else if(nt > 70) {
		printf("BB");
	} else {
		printf("FF");
	}
}
