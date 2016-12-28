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
		cout << "Bellekte yer ay�rma hatas�\n";
		exit(1);
	}
	
	*p = '\0';
	len = 0;
}

// Katar nesnesi yok edilirken serbes b�rak�l�yor
strtype::~strtype() {
	cout << "p, serbes b�rak�l�yor";
	free(p);
}

void strtype::set(char *ptr) {
	if (strlen(ptr) >= SIZE) {
		cout <<  "Katar fazla b�y�k";
		return;
	}
	
	strcpy(p, ptr);
	len = strlen(p);
}

void strtype::show() {
	cout << p << " - uzunlu�u: " << len << "\n";
	
}

int main() {
	strtype s1, s2;
	s1.set("Bu bir deneme.");
	s2.set("C++ calisiyorum");
	s1.show();
	s2.show();
	return 0;
}
