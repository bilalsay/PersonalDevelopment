#include <iostream>

using namespace std;

class myclass {
	int x;
	public:
		myclass(int);
		int get();
};

myclass::myclass(int a) {
	x = a;
}

int myclass::get() {
	return x;
}

int main() {
	myclass ob(120);
	myclass *p;
	p = &ob;
	cout << "Nesneyi kullanan deger: " << ob.get() << "\n";
	cout << "Ýþaretciyi kulanan deger: " << p->get() << "\n";
	
	
	return 0;
}
