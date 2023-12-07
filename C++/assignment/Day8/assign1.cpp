#include<iostream>
using namespace std;

int Strlen(char s[]){

    int i=0;
    int count =0;
    while(s[i]!='\0'){
        count++;
        i++;
    }

    return count;
}

int main(){
    char s[]="Hello World!";
    cout<<"length of string : "<<Strlen(s);
}