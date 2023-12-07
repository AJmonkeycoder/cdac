#include<iostream>
using namespace std;



void ones(int num) {
    switch(num){
        case 1 : cout<<"One "; break;
        case 2 : cout<<"Two "; break;
        case 3 : cout<<"Three "; break;
        case 4 : cout<<"four "; break;
        case 5 : cout<<"Five "; break;
        case 6 : cout<<"Six "; break;
        case 7 : cout<<"Seven "; break;
        case 8 : cout<<"Eight "; break;
        case 9 : cout<<"Nine "; break;
        case 10 : cout<<"Ten "; break;
        case 11 : cout<<"Eleven "; break;
        case 12 : cout<<"Twelve "; break;
        case 13 : cout<<"Thirteen "; break;
        case 14 : cout<<"Fourteen "; break;
        case 15 : cout<<"Fifteen "; break;
        case 16 : cout<<"Sixteen "; break;
        case 17 : cout<<"Seventeen "; break;
        case 18 : cout<<"Eighteen "; break;
        case 19 : cout<<"Ninteen"; 
        
    
    }
}

void tens(int num){
    switch(num){
        case 2 : cout<<"Twenty "; break; 
        case 3 : cout<<"Thirty "; break; 
        case 4 : cout<<"Fourty "; break; 
        case 5 : cout<<"Fifty "; break; 
        case 6 : cout<<"Sixty "; break; 
        case 7 : cout<<"Seventy "; break; 
        case 8 : cout<<"Eighty "; break; 
        case 9 : cout<<"Ninety "; break; 
    }
}

void extra(int num){
    switch(num){
        case 1 : cout<<"Hundred "; break;
        case 2 : cout<<"Thousand "; break;
        case 3 : cout<<"Lakh "; break;
        case 4 : cout<<"crore "; break;
    }
}

void solve(int num, int count){
    if(num > 19){
        int no1 = num%10;
        num/=10;
        tens(no1);
        ones(num);
        
    }else{
        ones(num);
    }

   switch(count){
    case 9 : extra(4); break;
    case 8 : extra(4); break;
    case 7 : extra(3); break;
    case 6 : extra(3); break;
    case 5 : extra(2); break;
    case 4 : extra(2); break;
    case 3 : extra(1); break;
   
   }
}

int main(){
    int num;
    cout<<" Enter a  number : ";
    cin>>num;

    int rev=0;
    int digitCount=0;
    while(num){
        rev*=10;
        rev+=num%10;
        num/=10;
        digitCount++;
    }

    while(rev){
        if(digitCount == 9){
            int part=rev%100;
            rev=rev/100;
            solve(part, digitCount);
            digitCount-=2;
            

        }
        else if(digitCount == 8){
            int part=rev%10;
            rev=rev/10;
            solve(part, digitCount);
            digitCount-=1;

        }
        else if(digitCount == 7){
            int part=rev%100;
            rev=rev/100;
            solve(part, digitCount);
            digitCount-=2;
        
        }
        else if(digitCount == 6){
            int part=rev%10;
            rev=rev/100;
            solve(part, digitCount);
            digitCount-=1;
        }
        else if(digitCount == 5){
            int part=rev%100;
            rev=rev/100;
            solve(part, digitCount);
            digitCount-=2;
        
        }else if(digitCount == 4){
            int part=rev%10;
            rev=rev/10;
            solve(part, digitCount);
            digitCount-=1;

        }else if(digitCount == 3){
            int part=rev%10;
            rev=rev/10;
            solve(part, digitCount);
            digitCount-=1;

        }else if(digitCount == 2){
            int part=rev%100;
            rev=rev/100;
            solve(part, digitCount);
            digitCount-=2;
            

        }else if(digitCount == 1){
            int part=rev%10;
            rev=rev/10;
            solve(part, digitCount);
            digitCount-=1;
            

        }
    }




    return 0;
}