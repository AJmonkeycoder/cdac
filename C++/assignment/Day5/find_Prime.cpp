#include<iostream>
using namespace std;

bool isPrime(int num){
    if(num==0) return false;
    if(num==1 || num==2) return true;
    for(int i=2; i<num; i++){
        if(num%i==0) return false;
    }

    return true;

}

int main(){
    int n,m;
    cout<<"Enter two numbers n and m : ";
    cin>>n>>m;
    for(int i=n; i<=m; i++){
        if(isPrime(i)) cout<<i<<" ";
    }
}