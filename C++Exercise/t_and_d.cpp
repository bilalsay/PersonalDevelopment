#include <iostream>
#include <ctime>
#include <cstring>

using namespace std;

class t_and_d {
	char currentClock[10];
	char currentDate[10];
	struct tm *zmn;
	public:
		t_and_d(time_t cTime);
		char show();	
};

t_and_d::t_and_d(time_t cTime) {
	
	ctime(&cTime);
	zmn = localtime(&cTime);
	
	
	char hour[2];
	char minute[2];
	char day[2];
	char moon[2];
	char year[4];
	
	sprintf(hour,"%d",zmn->tm_hour);
	sprintf(minute,"%d",zmn->tm_min);
	sprintf(day,"%d",zmn->tm_mday);
	sprintf(moon,"%d",zmn->tm_mon+1);
	sprintf(year,"%d",zmn->tm_year+1900);
	
	strcat(currentClock, hour);
	strcat(currentClock, ":");
	strcat(currentClock, minute);
	
	strcat(currentDate, day);
	strcat(currentDate, "/");
	strcat(currentDate, moon);
	strcat(currentDate, "/");
	strcat(currentDate, year);
}

char t_and_d::show() {
	cout << "Þuanki saat: " << currentClock << " ve tarih: " << currentDate << "\n";
}


int main() {
	t_and_d td(time(0));
	td.show();
	return 0;
	
}


