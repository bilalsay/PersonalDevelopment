#include <iostream>
#include <ctime>

using namespace std;

class timer {
	clock_t start;
	clock_t end;
	public:
		timer(); // constructor
		~timer(); // destructor
};

timer::timer() {
	start = clock();
}

timer::~timer() {
	end = clock();
	cout << "Geçen zaman: " << (end-start) / CLOCKS_PER_SEC << "\n";	
}

int main() {
	timer t;
	char c;
	
	cout << "Bir tuþa ve sonra enter e basýn: ";
	cin >> c;
	return 0;
}
