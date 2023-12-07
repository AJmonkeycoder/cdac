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
    while(div < num){
        if (num % div == 0)
        {
            ans += div;
            

        }
        div++;
    }

    if(ans == num) cout<<"The number is a perfect number\n";
    else cout<<"The number is not a perfect number";
}