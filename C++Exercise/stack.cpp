#include <iostream>

using namespace std;

#define SIZE 10

class stack{
	char stck[SIZE]; // stack için yer açar
	int tos; // index of top of stack
	
	public:
		void init(); // stack için gerekli hazýrlýklarý yapar
		void push(char ch); // stack a karakter iter
		char pop(); // stack tan karakter çeker
		
};
// stack için gerekli hazýrlýklarý yapar
void stack::init() {
	tos = 0;		
}

// stack a bir karakter iter
void stack::push(char ch) {
	if (tos == SIZE) {
		cout << "Yýðýn dolu ";
		return;
	} 
	
	stck[tos] = ch;
	tos++;
}

// stack dan bir karakter çeker
char stack::pop() {
	if (tos == 0) {
		cout << "Yýðýn boþ";
		return 0; // yýðýn boþsa 0 döndürür
	}
	
	tos--;
	return stck[tos];
}

int main() {
	stack s1, s2; // iki yýðýn oluþturur
	int i;
	
	s1.init();
	s2.init();
	s1.push('a');
	s2.push('x');
	s1.push('b');
	s2.push('y');
	s1.push('c');
	s2.push('z');
	
	for (i = 0; i < 3; i++) cout << "s1 ' i çek: " << s1.pop() << "\n";
	for (i = 0; i < 3; i++) cout << "s2 ' yi çek: " << s2.pop() << "\n";
	
	
	return 0;
}
