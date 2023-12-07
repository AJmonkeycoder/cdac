// count of a digit in a number;

#include<iostream>
using namespace std;

int main(){

    int num;
    do{
        cout<<"Enter a positive number : ";
        cin>>num;
    }while(num<0);

    int digit;
    cout<<"Enter the digit : ";
    cin>>digit;

    int count=0;
    while(num){
        if (num % 10 == digit)
        {
            count++;
            

        }
        num=num/10;
    }

    cout<<"Count of digit is "<<count;
}















