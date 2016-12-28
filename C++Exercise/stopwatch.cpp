#include <iostream>
#include <ctime>

using namespace std;

class stopwatch {
	int passedTime;
	clock_t startO;
	clock_t stopO;
	
	public:
		stopwatch();
		~stopwatch();
		void start();
		void stop();
		char show();
		int getTime();
};

stopwatch::stopwatch() {
	passedTime = 0;
}

stopwatch::~stopwatch() {
	cout << passedTime << "\n";
}

void stopwatch::start() {
	startO = clock();
}

void stopwatch::stop() {
	stopO = clock();
	
	
}

char stopwatch::show() {
	passedTime = (stopO - startO) / CLOCKS_PER_SEC;
	cout << "Gecen sure: " << passedTime << "\n";
}

int stopwatch::getTime() {
	return passedTime;
}

int main() {
	char key;
	stopwatch s;
	if (s.getTime() == 0) {
		cout << "Süreyi baþlatýn";
		cin >> key;
		if(key == '1') {
			s.start();
			cout << "Süreyi durdurun";
			cin >> key;
			if (key == '0') {
				s.stop();
				s.show();
			}
		}
	} 
	return 0;
	
}
