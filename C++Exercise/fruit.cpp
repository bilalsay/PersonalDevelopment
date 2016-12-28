#include <iostream>
#include <cstring>

using namespace std;

enum yn {hayir, evet};
enum color {kirmizi, sari, yesil, turuncu};

void out(enum yn x);
char *c[] = {"kýrmýzý", "sarý", "yeþil", "turuncu"};

class fruit {
	public:
		enum yn surekli;
		enum yn mevsimlik;
		enum yn agac;
		enum yn tropik;
		enum color clr;
		char name[40];	
};

class Apple : public fruit {
	enum yn pisirmekicin;
	enum yn suyuicin;
	enum yn yemekicin;
	enum yn ezmekicin;
	public:
		void seta(char *n, enum color c, enum yn ck, enum yn crchy, enum yn e);
		void show();
};

class Orange : public fruit {
	enum yn meyvasuyu;
	enum yn recel;
	enum yn yemek;
	public:
		void seto(char *n, enum color c, enum yn j, enum yn sr, enum yn e);
		void show();
};

void Apple::seta(char *n, enum color c, enum yn ck, enum yn crchy, enum yn e) {
	surekli = hayir;
	mevsimlik = evet;
			
	agac = evet;
	tropik = hayir;
	clr = c;
	pisirmekicin = ck;
	ezmekicin = crchy;
	strcpy(name, n);
	yemekicin = e;
}

void Orange::seto(char *n, enum color c, enum yn j, enum yn sr, enum yn e) {
	strcpy(name, n);
	surekli = hayir;
	mevsimlik = evet;
	agac = evet;
	tropik = evet;
	clr = c;
	meyvasuyu = j;
	recel = sr;
	yemek = e;
}		

void Apple::show() {
	cout << name << " elma: \n";
	cout << "Sürekli: "; out(surekli);
	cout << "Mevsimlik: "; out(mevsimlik);
	cout << "Aðac: "; out(agac);
	cout << "Tropik: "; out(tropik);
	cout << "Color: " << c[clr] << "\n";
	cout << "Piþirilirmi: "; out(pisirmekicin);
	cout << "Ezilip suyu çýkarýlýrmý: "; out(ezmekicin);
	cout << "Yenir mi: "; out(yemekicin);
	cout << "\n";	
}

void Orange::show() {
	cout << name << " portakal: \n";
	cout << "Sürekli: "; out(surekli);
	cout << "Mevsimlik: "; out(mevsimlik);
	cout << "Aðaç: "; out(agac);
	cout << "Tropik: "; out(tropik);
	cout << "Renk: " << c[clr] << "\n";
	cout << "Meyva suyu yapýlýr mý: "; out(meyvasuyu);
	cout << "Reçel: "; out(recel);
	cout << "Yenilirmi: "; out(yemek);
	cout << "\n";	
}

void out(enum yn x) {
	if (x == hayir) cout << "hayýr\n";
	else cout << "evet\n";
}

int main() {
	Apple a1, a2;
	Orange o1, o2;
	
	a1.seta("Red Delicious", kirmizi, hayir, evet, evet);
	a2.seta("Jonathan", kirmizi, evet, hayir, evet);
	
	o1.seto("Navel", turuncu, hayir, hayir, evet);
	o2.seto("Valencia", turuncu, evet, evet, hayir);
	
	a1.show();
	a2.show();
	o1.show();
	o2.show();
	return 0;
}
