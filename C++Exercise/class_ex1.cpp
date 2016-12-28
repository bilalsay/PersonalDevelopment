#include <iostream>
using namespace std;

class myclass {
	// private olarak tanýmlananlar
	int a;
	
	public:
		void set_a(int aValue);
		int get_a();
	
};

void myclass::set_a(int aValue) {
			a = aValue;
		}
		
		int myclass::get_a() {
			return a;	
		}
		
		int main() {
			myclass ob1, ob2;
			ob1.set_a(30);
			ob2.set_a(99);
			
			cout << ob1.get_a() <<"\n";
			cout << ob2.get_a() << "\n";
			return 0;
		}
