#include <iostream>
#include <math.h>
using namespace std;

class calculate {
	public:
		int sroot(int number);
		double sroot(double number);
		long sroot(long number);
};

int calculate::sroot(int number) {
	return sqrt(number);
}

double calculate::sroot(double number) {
	return sqrt(number);
}

long calculate::sroot(long number) {
	return sqrt(number);
}

int main() {
	calculate clc;
	cout << clc.sroot(9);
	return 0;
}
