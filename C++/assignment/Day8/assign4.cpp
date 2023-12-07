#include<iostream>
using namespace std;

void ToUpper(char src[]){

    int i=0;
    
    while(src[i]!='\0'){
        if(src[i]>=97 and src[i]<=122)
            src[i]=src[i] - 32;
            i++;
    }

    
}

int main(){
    char src[]="Hello World!";
    
    ToUpper(src);

    int i=0;
    while(src[i]!='\0'){
        cout<<src[i];
        i++;
    }
}