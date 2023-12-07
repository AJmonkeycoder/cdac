// Find the palindrome positive integer

#include<iostream>
using namespace std;

int main(){

    int num;
    do{
        cout<<"Enter a positive number : ";
        cin>>num;
    }while(num<0);

    int ans=0;
    int check = num;
    
    while(num != 0){
        ans=ans*10;
        ans += num % 10;
        
        num = num / 10;
    }
    cout<<ans<<"\n";
    //cout<<num<<"\n";
    //num = num / 10;
    if(ans == check) cout<<" A palindrome";
    else cout<<" Not a palindrome";

    return 0;
    
}