#include <iostream>

using namespace std;

int main(){
	char str[100];
	cout << "Bir karakter katarı griniz.";
	cin >> str;
	int i = 0;
	for(i = 0; str[i] != '\0'; i++){}
	cout << "Girdiğiniz karakter katarının uzunluğu: " << i;
	return 0;
}
