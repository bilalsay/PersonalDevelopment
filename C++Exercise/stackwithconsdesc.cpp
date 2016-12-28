#include <iostream>
using namespace std;

#define SIZE 10

class stack {
	char stck[SIZE]; // Bu stack � saklamaka i�indeir
	int tos; // Stack �n �st index i
	
	public:
		stack(); // constructor
		void push(char ch); // Stack a karakter iter
		char pop(); // Stack dan karakter �eker
		
};

// Stack � haz�r hale getirir
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

// Bir karakter �eker
char stack::pop() {
	if (tos == 0) {
		cout << "Yigin bos \n";
		return 0; // Y���n bo�sa s�f�r d�nd�r�r.
	}
	tos--;
	return stck[tos];
	
}

int main() {
	// Otomatik olarak haz�rlanan iki y���n olu�turur
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
