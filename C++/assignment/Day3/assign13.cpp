// convert digit to integer;

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
        ans *=10;
        ans += num %10;
        num = num/10;
    }

    num=ans;
    while(num){

        int digit = num%10;

        switch(digit){
            case 1 : cout<<"One "; break;
            case 2 : cout<<"Two "; break;
            case 3 : cout<<"Three "; break;
            case 4 : cout<<"Four "; break;
            case 5 : cout<<"Five "; break;
            case 6 : cout<<"Six "; break;
            case 7 : cout<<"Seven "; break;
            case 8 : cout<<"Eight "; break;
            case 9 : cout<<"Nine "; break;
        }
        num=num/10;
    }





    return 0;



}