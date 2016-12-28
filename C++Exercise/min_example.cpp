#include <iostream>

using namespace std;

char min(char, char);
int min(int, int);
double min(double, double);

int main() {
cout << "Char min : " << min('as', 'ar') << "\n";
cout << "Int min : " << min(12, 21) << "\n";
cout << "Double min : " << min(32.04, 23.05) << "\n";
return 0;
}

char min(char arg1, char arg2){
	return arg1 < arg2 ? arg1 : arg2;
}

int min(int arg1, int arg2) {
	return arg1 < arg2 ? arg1 : arg2;
}

double min(double arg1, double arg2) {
	return arg1 < arg2 ? arg1 : arg2;
}
