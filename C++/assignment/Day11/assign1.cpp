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
    // Copy constructor (deep copy)
    String(const String& other) : data(nullptr), length(0) {
        length = other.Length();
        data = new char[length + 1];
        strcpy(data, other.GetData());
    }

    // Assignment operator (deep copy)
    String& operator=(const String& other) {
        if (this != &other) { 
            delete[] data; 
            length = other.Length();
            data = new char[length + 1];
            strcpy(data, other.GetData());
        }
        return *this;
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

    // Display function
    void Display() const {
        cout << data;
    }
};

int main() {
    String str1("Hello");
    String str2("World");

    cout << "str1: ";
    str1.Display();
    cout << endl;

    cout << "str2: ";
    str2.Display();
    cout << endl;

    
    String str3 = str1; 
    cout << "str3 (copy of str1): ";
    str3.Display();
    cout << endl;

    
    String str4;
    str4 = str2; 
    cout << "str4 (copy of str2): ";
    str4.Display();
    cout << endl;

    return 0;
}
