#include<iostream>
using namespace std;

bool Compare(char src[], char dest[]){

    int i=0;
    
    while(src[i]!='\0'){
        if(dest[i]!=src[i]) return false;
        i++;
    }

    return true;
}

int main(){
    char src[]="Hello World!";
    char dest[]="Hello World!";
    cout<<Compare(src, dest);
}