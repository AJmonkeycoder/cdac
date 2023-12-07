#include <iostream>
#include <cstring>
using namespace std;

class String {
private:
    char* data;
    int length;

public:
    // Constructors
    String() : data(nullptr), length(0) {}
    String(const char* str) : data(nullptr), length(0) {
        length = strlen(str);
        data = new char[length + 1];
        strcpy(data, str);
    }
    String(const String& other) : data(nullptr), length(0) {
        length = other.Length();
        data = new char[length + 1];
        strcpy(data, other.GetData());
    }

    // Destructor
    ~String() {
        delete[] data;
    }

    // Member Functions
    int Length() const {
        return length;
    }

    const char* GetData() const {
        return data;
    }

    void SetData(const char* str) {
        delete[] data;
        length = strlen(str);
        data = new char[length + 1];
        strcpy(data, str);
    }

    // Overloaded Relational Operators
    bool operator==(const String& other) const {
        return (strcmp(data, other.GetData()) == 0);
    }

    bool operator!=(const String& other) const {
        return !(*this == other);
    }

    bool operator<(const String& other) const {
        return (strcmp(data, other.GetData()) < 0);
    }

    bool operator<=(const String& other) const {
        return (strcmp(data, other.GetData()) <= 0);
    }

    bool operator>(const String& other) const {
        return (strcmp(data, other.GetData()) > 0);
    }

    bool operator>=(const String& other) const {
        return (strcmp(data, other.GetData()) >= 0);
    }
};

int main() {
    String str1("Hello");
    String str2("World");
    String str3("Hello");

    cout << "str1: " << str1.GetData() << endl;
    cout << "str2: " << str2.GetData() << endl;
    cout << "str3: " << str3.GetData() << endl;

    if (str1 == str2) {
        cout << "str1 is equal to str2." << endl;
    } else {
        cout << "str1 is not equal to str2." << endl;
    }

    if (str1 == str3) {
        cout << "str1 is equal to str3." << endl;
    } else {
        cout << "str1 is not equal to str3." << endl;
    }

    if (str1 < str2) {
        cout << "str1 is less than str2." << endl;
    } else {
        cout << "str1 is not less than str2." << endl;
    }

    return 0;
}
