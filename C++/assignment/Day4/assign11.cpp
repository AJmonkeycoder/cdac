        // check for armstrong number;

#include<iostream>
using namespace std;

int main(){

    int num;
    do{
        cout<<"Enter a positive number : ";
        cin>>num;
    }while(num<0);

    int digitcount=0;
    int temp = num;
    while(temp){
        temp=temp/10;
        digitcount++;
    }

    temp=num;

    int ans = 0;
    int div = 1;
    while(temp){
       int digit = temp %10;
       int i=digitcount;
       int prod=1;
       while(i>0){
        prod *= digit;
        i--;
       }
       ans+=prod;
       cout<<ans<<endl;
       temp=temp/10;
        
    }

    if(ans == num) cout<<"The number is a armstrong number\n";
    else cout<<"The number is not a Armstrong number";

    return 0;
}
