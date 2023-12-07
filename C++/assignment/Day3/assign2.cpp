// find reverse of number;

#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter a number : ";
    cin>>n;

   while(n){
    cout<<n%10;
    n=n/10;
   }

    return 0;

}