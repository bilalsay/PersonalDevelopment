#include <iostream>
using namespace std;

char rev_str(char[]);
int lengthStr(char[]);
int main() {
	rev_str("Dunya bir beyder cennet cehennem birer mahzendir.");
	return 0;
}

char rev_str(char str[]) {
	
	int i = lengthStr(str);
	for(int j = i; j >= 0; j--) {
		cout << str[j];
	}
}

int lengthStr(char str[]) {
	int i = 0;
	for(i = 0; str[i] != '\0'; i++){}
	return i - 1;
}
