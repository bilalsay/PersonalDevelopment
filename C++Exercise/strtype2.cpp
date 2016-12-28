#include <iostream>
#include <cstring>
#include <cstdlib>

using namespace std;

class strtype {
	char *p;
	int len;
	
	public:
		strtype(char *ptr);
		~strtype();
		void show();		
		
};

strtype::strtype(char *ptr) {
	len = strlen(ptr);
	
	p = (char *) malloc(len+1);
	if(!p) {
		cout << "Bellekte yer ay�rma hatas� \n";
		exit(1);
	}
	strcpy(p, ptr);
}

strtype::~strtype() {
	cout << "p, serbest b�raak�l�yor \n";
	free(p);
}

void strtype::show() {
	cout << p << " -uzunluk: " << len << "\n";
}

int main() {
	/*
	strtype s1 = strtype("Bu, bir deneme.");
	strtype s2 = strtype("C++'� yaz�yorum.");
	*/
	strtype s1("Bu, bir deneme."), s2("C++'� yaz�yorum.");
	s1.show();
	s2.show();
	return 0;
}
