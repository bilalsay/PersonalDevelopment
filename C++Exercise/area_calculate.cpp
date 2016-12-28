#include <iostream>

using namespace std;

class area_cl {
public:
	double width;
	double height;
};

class rectangle : public area_cl {
	public:
		rectangle(double w, double h);
		char area();
};

class isosceles : public area_cl {
	public:
		isosceles(double w, double h);
		char area();
};

rectangle::rectangle(double w, double h) {
	width = w;
	height = h;
}

char rectangle::area() {
	cout << "Dörtgenin Alaný: " << (width * height) << "\n";
}

isosceles::isosceles(double w, double h) {
	width = w;
	height = h;
}

char isosceles::area() {
	cout << "Ýkizkenarýn Alaný: " << ((width * height) / 2) << "\n";
}

int main() {
	rectangle r(34, 56);
	isosceles i(45, 32);
	r.area();
	i.area();
	return 0;
}
