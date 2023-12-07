// Find prime numbers b/w 2 positive integer n and m, including both

#include<iostream>
using namespace std;

int main(){
    int n, m;
    cout<<"Enter two number N and M positive number: ";
    cin>>n>>m;
    if(n==2){
        cout<<n<<" ";
        n++;
    }
    while(n<=m){
        int i=2;
        while(i<n){
            if(n%i==0) break;
            i++;
        }
        
        if(i==n) cout<<i<<" ";
        n++;

    }

    return 0;

}