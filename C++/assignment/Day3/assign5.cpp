// Find the first digit in a positive integer

#include<iostream>
using namespace std;

int main(){

    int num;
    do{
        cout<<"Enter a positive number : ";
        cin>>num;
    }while(num<0);

    int ans=0;
    while(num){
        
        ans = num%10;
        num = num/10;
    }

    cout<<"First positive number is "<<ans;
}