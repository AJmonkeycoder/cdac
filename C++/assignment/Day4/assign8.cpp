// Find the product of all digits of positive integer

#include<iostream>
using namespace std;

int main(){

    int num;
    do{
        cout<<"Enter a positive number : ";
        cin>>num;
    }while(num<0);

    int ans=1;
    if(num==0) ans=0;
    while(num){
        
        ans *= num%10;
        num = num/10;
    }

    cout<<"Sum of digits is "<<ans;
}