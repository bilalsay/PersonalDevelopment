#include <iostream>

using namespace std;

void sleep(int);
void sleep(char *);

int main(){
	cout << "Selamun aleyküm";
	//sleep(5);
	
	sleep("10");
	cout << "Merhaba";
	return 0;
}

void sleep(int second) {;
	sleep(second);
}

void sleep(char *second) {
	sleep(second);
}
