#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the number : ";
    cin>>n;
    int div=1;
    while(div<=n){
        if(n%div==0) cout<<div<<" ";
        div++;
    }
}