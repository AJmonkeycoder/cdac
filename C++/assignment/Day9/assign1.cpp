#include<iostream>
using namespace std;

class BigInt{
    int num;

    public:
    BigInt(int n) : num(n) {
    }

    bool operator==(BigInt number){
        return num==number.num ;
    }
    bool operator<=(BigInt number){
        return num<=number.num ;
    }
    bool operator>=(BigInt number){
        return num>=number.num ;
    }
    bool operator<(BigInt number){
        return num<number.num ;
    }
    bool operator>(BigInt number){
        return num>number.num ;
    }
};

int main(){
    BigInt num1(50);
    BigInt num2(40);
    return 0;
}