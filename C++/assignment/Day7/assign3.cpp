// Find second largest element fom array
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

int findSecondLargest(int n, int arr[]){
    int mx=arr[0];
    for(int i=1; i<n; i++){
        if(arr[i]>mx) mx = arr[i];
    
    }
    int ans=arr[0];
    for(int i=1; i<n; i++){
        if(arr[i]>ans and arr[i]!=mx ){
            ans = arr[i];
        }
            
        
    
    }
    return ans;
}

int main(){
    
    int arr[100];
    int size;
    size = getInput(arr);
    cout<<"Second Largest element : "<<findSecondLargest(size, arr);

}