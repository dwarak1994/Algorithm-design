
#include <iostream>


using namespace std;

void insertion_sort(int A[],int length){

    for(int j=1;j<length;j++){
        int key=A[j];
        int i=j-1;
        while(i>=0 & A[i]>key){
            A[i+1]=A[i];
            i=i-1;
        }
        A[i+1]=key;
    }
    for(int i=0;i<length;i++){
        cout<<A[i]<<endl;
    }
}


int main(){
int A[5]={1,2,4,5,3};
insertion_sort(A,5);
return 0;
}
