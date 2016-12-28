#include <iostream>

using namespace std;

class box {
	double volume;
	public:
		box(double s1, double s2, double s3) {	
			this->volume = 	s1 * s2 * s3;	
		}
		
		double vol() {
			return this->volume;
		}
		
};

int main() {
	box bx(23.04, 34.45, 54.65);
	cout << bx.vol();	
}
