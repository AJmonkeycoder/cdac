#include<iostream>
using namespace std;


int reverse(int num){
    int rev=0;
    while(num){
        rev*=10;
        rev += num%10;
        num=num/10;
    }

    return rev;
}
int main(){

    int num;
    cout<<"Enter a number to find reverse : ";
    cin>>num;
    return 0;
}