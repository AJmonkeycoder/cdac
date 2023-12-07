#include<iostream>
using namespace std;

int main(){
    char str[100];
    int n=0;
    cout<<"Enter the string : \n";
    cin>>str[0];
    n++;
    while(str[n-1]!='\0'){
        cin>>str[0];
        n++;
    }
    n--;
    while(n){
        cout<<str[n];
        n--;
    }
}