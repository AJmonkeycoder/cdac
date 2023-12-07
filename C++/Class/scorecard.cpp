#include<bits/stdc++.h>
using namespace std;

class Student{
 int rollNo;
 string name;
 string subjectName[5];
 double marks[5];
 char grade;

 public :
    void input(){
        cout<<"Enter Roll no : ";
        cin>>rollNo;
        cout<<"Enter name : ";
        cin>>name;
        cout<<"Enter all subject name : ";
        for(int i=0; i<5; i++){
            cin>>subjectName[i];
        }
        cout<<"Enter marks of all subject : ";
        for(int i=0; i<5; i++){
            cin>>marks[i];
        }
    }

    void Display(){
        cout<<"Roll no : "<<rollNo<<" Name : "<<name<<endl;;
        for(int i=0; i<5; i++){
            cout<<"subject Name : "<<subjectName[i]<<" Marks : "<<marks[i]<<endl;
        }
        cout<<"Grade : "<<grade<<endl;
    }

   void calculate();

};

void Student :: calculate(){
   double sum=0;
    for (int  i = 0; i < 5; i++)
    {
        sum+=marks[i];
    }
    double avg = sum/5;
    if(avg>75) grade='A';
    else if(avg>65) grade='B';
    else if(avg>55) grade='C';
    else if(avg>45) grade='D';
    else  grade='F';
    
    
}

int main(){
    Student studentList[2];

    for(int i=0; i<2; i++){
        studentList[i].input();
        studentList[i].calculate();
        
    }

    for(int i=0; i<2; i++){
        studentList[i].Display();
        
    }
}


