// sum of all numbers b/w 2 positive integer n and m, including n and m;

#include<iostream>
using namespace std;

int main(){
    int n, m;
    cout<<"Enter two number N and M : ";
    cin>>n>>m;
    int sum=0;

    while(n<=m){
        sum+=n;
        n++;
    }

    cout<<"Sum = "<<sum;

    return 0;

}