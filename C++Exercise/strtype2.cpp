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
		cout << "Bellekte yer ayýrma hatasý \n";
		exit(1);
	}
	strcpy(p, ptr);
}

strtype::~strtype() {
	cout << "p, serbest býraakýlýyor \n";
	free(p);
}

void strtype::show() {
	cout << p << " -uzunluk: " << len << "\n";
}

int main() {
	/*
	strtype s1 = strtype("Bu, bir deneme.");
	strtype s2 = strtype("C++'ý yazýyorum.");
	*/
	strtype s1("Bu, bir deneme."), s2("C++'ý yazýyorum.");
	s1.show();
	s2.show();
	return 0;
}
