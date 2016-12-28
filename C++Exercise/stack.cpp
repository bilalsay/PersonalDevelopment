#include <iostream>

using namespace std;

#define SIZE 10

class stack{
	char stck[SIZE]; // stack i�in yer a�ar
	int tos; // index of top of stack
	
	public:
		void init(); // stack i�in gerekli haz�rl�klar� yapar
		void push(char ch); // stack a karakter iter
		char pop(); // stack tan karakter �eker
		
};
// stack i�in gerekli haz�rl�klar� yapar
void stack::init() {
	tos = 0;		
}

// stack a bir karakter iter
void stack::push(char ch) {
	if (tos == SIZE) {
		cout << "Y���n dolu ";
		return;
	} 
	
	stck[tos] = ch;
	tos++;
}

// stack dan bir karakter �eker
char stack::pop() {
	if (tos == 0) {
		cout << "Y���n bo�";
		return 0; // y���n bo�sa 0 d�nd�r�r
	}
	
	tos--;
	return stck[tos];
}

int main() {
	stack s1, s2; // iki y���n olu�turur
	int i;
	
	s1.init();
	s2.init();
	s1.push('a');
	s2.push('x');
	s1.push('b');
	s2.push('y');
	s1.push('c');
	s2.push('z');
	
	for (i = 0; i < 3; i++) cout << "s1 ' i �ek: " << s1.pop() << "\n";
	for (i = 0; i < 3; i++) cout << "s2 ' yi �ek: " << s2.pop() << "\n";
	
	
	return 0;
}
