#include <iostream>

using namespace std;

class card{
	char *bookName;
	char *authorName;
	int numberOfBook;
	
	public:
		void store(char *bName, char *aName, int bNumber);
		char show();
};

void card::store(char *bName, char *aName, int bNumber) {
	bookName = bName;
	authorName = aName;
	numberOfBook = bNumber;
}

char card::show() {
	cout << "Kitab�n Ad�: " << bookName << " Yazar�: " << authorName << " Adedi: " << numberOfBook << " \n";
}

int main() {
	card card1;
	card card2;
	
	card1.store("S�zler", "Said Nursi", 200);
	card2.store("Mektubat", "Said Nursi", 500);
	
	card1.show();
	card2.show();
}
