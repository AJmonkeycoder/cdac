#include<iostream>
using namespace std;

class Date {
    int day;
    int month;
    int year;

public:
    Date();
    Date(int d, int m, int y);
    void Read();
    void Write();
    bool operator==(Date obj2);
    bool operator!=(Date obj2);
    bool operator<(Date obj2);
    bool operator<=(Date obj2);
    bool operator>(Date obj2);
    bool operator>=(Date obj2);
};

Date::Date() {
    day = 0;
    month = 0;
    year = 0;
}

Date::Date(int d, int m, int y) {
    day = d;
    month = m;
    year = y;
}

void Date::Read() {
    cout << "Enter day: ";
    cin >> day;
    cout << "Enter month: ";
    cin >> month;
    cout << "Enter year: ";
    cin >> year;
}

void Date::Write() {
    cout << day << "/" << month << "/" << year;
}

bool Date::operator==(Date obj2) {
    return (day == obj2.day && month == obj2.month && year == obj2.year);
}

bool Date::operator!=(Date obj2) {
    return !(*this == obj2);
}

bool Date::operator<(Date obj2) {
    if (year < obj2.year) {
        return true;
    }
    else if (year == obj2.year && month < obj2.month) {
        return true;
    }
    else if (year == obj2.year && month == obj2.month && day < obj2.day) {
        return true;
    }
    return false;
}

bool Date::operator<=(Date obj2) {
    return (*this < obj2) || (*this == obj2);
}

bool Date::operator>(Date obj2) {
    return !(*this <= obj2);
}

bool Date::operator>=(Date obj2) {
    return !(*this < obj2);
}

int main() {
    Date date1, date2;

    cout << "Enter the first date:" << endl;
    date1.Read();

    cout << "Enter the second date:" << endl;
    date2.Read();

    cout << "Date 1: ";
    date1.Write();
    cout << endl;

    cout << "Date 2: ";
    date2.Write();
    cout << endl;

    if (date1 == date2) {
        cout << "Date 1 is equal to Date 2." << endl;
    }
    else if (date1 != date2) {
        cout << "Date 1 is not equal to Date 2." << endl;
    }

    if (date1 < date2) {
        cout << "Date 1 is earlier than Date 2." << endl;
    }
    else if (date1 <= date2) {
        cout << "Date 1 is either earlier than or equal to Date 2." << endl;
    }

    if (date1 > date2) {
        cout << "Date 1 is later than Date 2." << endl;
    }
    else if (date1 >= date2) {
        cout << "Date 1 is either later than or equal to Date 2." << endl;
    }

    return 0;
}
