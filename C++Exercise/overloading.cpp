#include <iostream>

using namespace std;

int abs(int n);
long abs(long n);
double abs(double n);

int main() {
	cout << "-10 un mutlak de�eri: " << abs(-10) << "\n";
	cout << "-10L nin mutlak de�eri: " << abs(-10L) << "\n";
	cout << "-10.01 in mutlak de�eri: " << abs(-10.01) << "\n";
	return 0;
}

// abs for int
int abs(int n) {
	cout << "Tamsay�lar i�in abs() \n";
	return n < 0 ? -n : n;
}

// abs for long
long abs(long n) {
	cout << "Long say�lar i�in abs() \n";
	return n < 0 ? -n : n;
}

// abs for double
double abs(double n) {
	cout << "Double say�lar i�in abs() \n";
	return n < 0 ? -n : n;
}

