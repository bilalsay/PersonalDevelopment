#include <iostream>

using namespace std;

void oku(int[], int);

int main() {
	int mevcut, toplam, enYuksek = 0;
	int *notlar;
	
	cout << "S�n�f mevcudunu giriniz: ";
	cin >> mevcut;
	notlar = new int[mevcut];
	oku(notlar, mevcut);
	for(int i = 0; i < mevcut; i++) {
		toplam += notlar[i];
		if (notlar[i] > enYuksek)
			enYuksek = notlar[i];
	}

	cout << "S�n�f ortalamas� = " << toplam / mevcut << endl;
	cout << "En y�ksek not = " << enYuksek << endl;
	delete [] notlar;
	cin.get();
	return 0;
}

void oku(int notDizi[], int boyut) {
	cout << "Notlar� giriniz: ";
	for(int i = 0; i < boyut; i++) 
		cin >> notDizi[i];
}
