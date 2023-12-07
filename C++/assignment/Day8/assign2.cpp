#include<iostream>
using namespace std;

void StrCpy(char src[], char dest[]){

    int i=0;
    
    while(src[i]!='\0'){
        dest[i]=src[i];
    }
    i=0;
    while(dest[i]!='\0'){
        cout<<dest[i];
        i++;
    }
}

int main(){
    char src[]="Hello World!";
    char dest[]="";
    StrCpy(src, dest);
}