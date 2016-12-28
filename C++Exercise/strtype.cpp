#include <iostream>
#include <cstring>
#include <cstdlib>

using namespace std;

# define SIZE 255

class strtype {
	char *p;
	int len;
	public:
		strtype(); // constructor
		~strtype(); // destructor
		void set(char *ptr);
		void show();		
};

strtype::strtype() {
	p = (char *) malloc(SIZE);
	if(!p){ 
		cout << "Bellekte yer ayýrma hatasý\n";
		exit(1);
	}
	
	*p = '\0';
	len = 0;
}

// Katar nesnesi yok edilirken serbes býrakýlýyor
strtype::~strtype() {
	cout << "p, serbes býrakýlýyor";
	free(p);
}

void strtype::set(char *ptr) {
	if (strlen(ptr) >= SIZE) {
		cout <<  "Katar fazla büyük";
		return;
	}
	
	strcpy(p, ptr);
	len = strlen(p);
}

void strtype::show() {
	cout << p << " - uzunluðu: " << len << "\n";
	
}

int main() {
	strtype s1, s2;
	s1.set("Bu bir deneme.");
	s2.set("C++ calisiyorum");
	s1.show();
	s2.show();
	return 0;
}
