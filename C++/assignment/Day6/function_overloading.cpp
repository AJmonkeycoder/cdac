#include<iostream>
using namespace std;


void sum(int a, int b){
    cout<<"2 argument\n";
    cout<<a+b<<endl;

}

void sum(int a, int b, int c){
    cout<<"three arugument \n";
    cout<<a+b+c<<endl;
}

int main(){

    
    sum(4,5);
    sum(4,5,6);

    
} // namespace std;
