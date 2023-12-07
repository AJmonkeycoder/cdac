#include<iostream>
using namespace std;    

class Array{
    int *pData;
    const int size;

public:
    Array(int n) : size(n){
        cout<<"Allocate memory for array of size "<<size<<endl;
        pData = new int[size];
    }

    ~Array(){
        cout<<"Free array memory of size "<<size<<endl;
        delete pData;
    }

    int& operator[](int i){
        static int temp;
        if(i<0 || i>=size){
            return temp;
        }

        return pData[i];
    }
};

int main(){
    Array arr1(5);
    Array arr2(arr1);
    arr1[0]=1;
    arr2[0]=2;

    cout<<"1st element of arr1 = "<<arr1[0]<<endl;
    cout<<"1st element of arr2 = "<<arr2[0]<<endl;


}