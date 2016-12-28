#include <iostream>
#include <cstdlib>
using namespace std;

class stack {
	char *stck; // Bu stack ý saklamaka içindeir
	int tos; // Stack ýn üst index i
	int stackSize;
	
	public:
		stack(int size); // constructor
		~stack(); // desctructor
		void push(char ch); // Stack a karakter iter
		char pop(); // Stack dan karakter çeker
		
};

// Stack ý hazýr hale getirir
stack::stack(int size) {
	stackSize = size;
	stck = (char *) malloc(stackSize);
	cout << "Yigin olusturuluyor \n";
	tos = 0;
}

// destructor
stack::~stack() {
	cout << "Yok ediliyor\n";
	free(stck);
}

// Bir karakter iter
void stack::push(char ch) {
	if (tos == stackSize) {
		cout << "Yigin dolu \n";
		return;
	} 
	
	stck[tos] = ch;
	tos++;
}

// Bir karakter çeker
char stack::pop() {
	if (tos == 0) {
		cout << "Yigin bos \n";
		return 0; // Yýðýn boþsa sýfýr döndürür.
	}
	tos--;
	return stck[tos];
	
}

int main() {
	// Otomatik olarak hazýrlanan iki yýðýn oluþturur
	stack s1(20), s2(20);
	
	s1.push('a');
	s2.push('x');
	s1.push('b');
	s2.push('y');
	s1.push('c');
	s2.push('z');
	
	for (int i = 0; i < 3; i++) cout << "s1' i cek: " << s1.pop() << "\n";
	for (int j = 0; j < 3; j++) cout << "s2' yi cek: " << s2.pop() << "\n";
	return 0;
;
}
