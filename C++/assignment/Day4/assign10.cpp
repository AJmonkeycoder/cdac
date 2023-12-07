// check for perfect number;

#include<iostream>
using namespace std;

int main(){

    int num;
    do{
        cout<<"Enter a positive number : ";
        cin>>num;
    }while(num<0);

    int ans = 0;
    int div = 1;
    for(int i=1; i<num; i++){
        if(num % i == 0) ans+=i;
    }
    

    if(ans == num) cout<<"The number is a perfect number\n";
    else cout<<"The number is not a perfect number";
}