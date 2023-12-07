// Find the sum of all digits of a integer

#include<iostream>
using namespace std;

int main(){

    int num;
    cout<<"Enter a number : ";
    cin>>num;

    if(num<0) num= num * -1;
   
    int ans=0;
    while(num){
        
        ans += num%10;
        num = num/10;
    }

    cout<<"Sum of digits is "<<ans;
}