#include <iostream>

using namespace std;

int abs(int n);
long abs(long n);
double abs(double n);

int main() {
	cout << "-10 un mutlak deðeri: " << abs(-10) << "\n";
	cout << "-10L nin mutlak deðeri: " << abs(-10L) << "\n";
	cout << "-10.01 in mutlak deðeri: " << abs(-10.01) << "\n";
	return 0;
}

// abs for int
int abs(int n) {
	cout << "Tamsayýlar için abs() \n";
	return n < 0 ? -n : n;
}

// abs for long
long abs(long n) {
	cout << "Long sayýlar için abs() \n";
	return n < 0 ? -n : n;
}

// abs for double
double abs(double n) {
	cout << "Double sayýlar için abs() \n";
	return n < 0 ? -n : n;
}

