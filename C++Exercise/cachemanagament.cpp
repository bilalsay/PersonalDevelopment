#include <iostream>

using namespace std;

void oku(int[], int);

int main() {
	int mevcut, toplam, enYuksek = 0;
	int *notlar;
	
	cout << "Sýnýf mevcudunu giriniz: ";
	cin >> mevcut;
	notlar = new int[mevcut];
	oku(notlar, mevcut);
	for(int i = 0; i < mevcut; i++) {
		toplam += notlar[i];
		if (notlar[i] > enYuksek)
			enYuksek = notlar[i];
	}

	cout << "Sýnýf ortalamasý = " << toplam / mevcut << endl;
	cout << "En yüksek not = " << enYuksek << endl;
	delete [] notlar;
	cin.get();
	return 0;
}

void oku(int notDizi[], int boyut) {
	cout << "Notlarý giriniz: ";
	for(int i = 0; i < boyut; i++) 
		cin >> notDizi[i];
}
