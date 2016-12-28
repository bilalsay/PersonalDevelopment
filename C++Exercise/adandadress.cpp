#include <iostream>
using namespace std;

class me {
	char *ad;
	char *adress;
	public:
		void sakla(char *ad, char *adress);
		void goster();
};

void me::sakla(char *ad, char *adress) {
	me::ad = ad;
	me::adress = adress;
}

void me::goster() {
	cout << "Adý: " << me::ad << "Adresi: " << me::adress;
}


int main() {
	me m;
	m.sakla("bilalsay", "Tokat");
	m.goster();
	return 0;
}

