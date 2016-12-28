#include <iostream>

using namespace std;

#define SIZE 100

class queue {
	int integers[SIZE];
	public:
		queue();
		char output();
};

queue::queue() {
	for(int i = 0; i <= SIZE ;i++) {
		integers[i] = i;
	}
}

char queue::output() {
	for (int i = 0; i <= SIZE; i++) {
		cout << integers[i] << "\n";
	}
}

int main() {
	queue q;
	q.output();
	return 0;
}
