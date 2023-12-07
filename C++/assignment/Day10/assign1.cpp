#include <iostream>
using namespace std;

class BigInt {
private:
    int num;

public:
    BigInt(int n) : num(n) {}

    // Binary operators
    BigInt operator+(BigInt number) {
        return BigInt(num +  number.num);
    }

    BigInt operator-(BigInt number) {
        return BigInt(num -  number.num);
    }

    BigInt operator*(BigInt number) {
        return BigInt(num *  number.num);
    }

    BigInt operator/(BigInt number) {
        if ( number.num != 0) {
            return BigInt(num /  number.num);
        } else {
            cerr << "Error: Division by zero." << endl;
            return BigInt(0);
        }
    }

    BigInt operator+(int n) {
        return BigInt(num + n);
    }

    BigInt operator-(int n)  {
        return BigInt(num - n);
    }

    BigInt operator*(int n)  {
        return BigInt(num * n);
    }

    BigInt operator/(int n)  {
        if (n != 0) {
            return BigInt(num / n);
        } else {
            cerr << "Error: Division by zero." << endl;
            return BigInt(0);
        }
    }

    // Unary operators
    BigInt& operator++() { 
        num++;
        return *this;
    }

    BigInt operator++(int) { 
        BigInt temp = *this;
        num++;
        return temp;
    }

    BigInt& operator--() {
        num--;
        return *this;
    }

    BigInt operator--(int) { 
        BigInt temp = *this;
        num--;
        return temp;
    }

   
    void Display() const {
        cout << num;
    }
};

int main() {
    BigInt num1(10);
    BigInt num2(5);

    cout << "num1: ";
    num1.Display();
    cout << endl;

    cout << "num2: ";
    num2.Display();
    cout << endl;

    
    BigInt sum = num1 + num2;
    BigInt difference = num1 - num2;
    BigInt product = num1 * num2;
    BigInt quotient = num1 / num2;

    cout << "Sum: ";
    sum.Display();
    cout << endl;

    cout << "Difference: ";
    difference.Display();
    cout << endl;

    cout << "Product: ";
    product.Display();
    cout << endl;

    cout << "Quotient: ";
    quotient.Display();
    cout << endl;

    
    cout << "Increment num1: ";
    (num1++).Display();
    cout << endl;

    cout << "Decrement num2: ";
    (--num2).Display();
    cout << endl;

    return 0;
}
