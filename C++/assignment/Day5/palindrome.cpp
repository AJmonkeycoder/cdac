// Find a number is palindrome or not

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
    cout<<"Enter a number to check for palindrome : ";
    cin>>num;
  
    if(num == reverse(num)) cout<<"A palindrome";
    else cout<<"Not a palindrome";
    return 0;
}