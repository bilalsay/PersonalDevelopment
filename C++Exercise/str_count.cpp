#include <iostream>

using namespace std;

int main(){
	char str[100];
	cout << "Bir karakter katar� griniz.";
	cin >> str;
	int i = 0;
	for(i = 0; str[i] != '\0'; i++){}
	cout << "Girdi�iniz karakter katar�n�n uzunlu�u: " << i;
	return 0;
}
