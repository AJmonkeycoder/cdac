// Find second minimum element fom array
#include<iostream>
using namespace std;

int getInput(int arr[]){
    int n;
    do{
        cout<<"Enter size of array less than 100 : ";
        cin>>n;
    }while(n>100);

    cout<<"Enter element of array\n";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    
    }
    return n;

}

bool search(int n, int arr[], int element){
    
    for(int i=0; i<n; i++){
        if(arr[i]==element) return true;
    
    }
    
    return false;
}

int main(){
    
    int arr[100];
    int size;
    size = getInput(arr);
    int element;
    cout<<"Element to search : ";
    cin>>element;
    if(search(size, arr, element)) cout<<"Exist ";
    else cout<<"Not exist";

}