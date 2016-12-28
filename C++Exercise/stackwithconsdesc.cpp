#include <iostream>
using namespace std;

#define SIZE 10

class stack {
	char stck[SIZE]; // Bu stack ý saklamaka içindeir
	int tos; // Stack ýn üst index i
	
	public:
		stack(); // constructor
		void push(char ch); // Stack a karakter iter
		char pop(); // Stack dan karakter çeker
		
};

// Stack ý hazýr hale getirir
stack::stack() {
	cout << "Yigin olusturuluyor \n";
	tos = 0;
}

// Bir karakter iter
void stack::push(char ch) {
	if (tos == SIZE) {
		cout << "Yigin dolu";
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
	stack s1, s2;
	
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
