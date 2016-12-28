#include <iostream>
using namespace std;

class myclass {
	int a;
	public:
		myclass(); // constructor
		~myclass(); // destructor
		void show();
};

myclass::myclass(){
	cout << "Constructur da \n";
	a = 10;
}

myclass::~myclass(){
	cout << "Yok edilioyor \n";
}

void myclass::show(){
	cout << a << "\n";
}

int main() {
	myclass ob;
	
	ob.show();
	
	return 0;
}
