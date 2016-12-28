#include <iostream>

using namespace std;
#define SIZE 100

class queue {
	int integers[SIZE];
	
	public:
		void init();
		char output();
};

void queue::init() {
	for (int i = 0; i <= SIZE; i++){
		integers[i] = i; 
	}
}

char queue::output() {
	for (int i = 0; i <= SIZE; i++) {
		cout << integers[i] << "\n";
	}
}

int main() {
	queue q1;
	
	q1.init();
	q1.output();
}

