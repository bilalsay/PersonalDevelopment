#include <iostream>

using namespace std;

void rotate(int);
void rotate(long);

int main() {
rotate(12);
cout << "\n";
rotate(4589789);

return 0;
}

void rotate(int d) {
	cout << (d << 1);
}

void rotate(long d) {
	cout << (d << 1);
}

