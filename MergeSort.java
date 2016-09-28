/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author dwaraknath
 */

public class MergeSort {
   
   public void merge(int []A,int p,int q,int r){
       int n1=q-p+1;
       int n2=r-q;
       int []L=new int[n1];
       int []R=new int[n2];
       for(int i=0;i<L.length;i++){
           L[i]=A[p+i];
           
       }
       printArray(L);
       for(int i=0;i<R.length;i++){
           R[i]=A[q+i+1];
       }
       printArray(R);
       int []tempA=new int[A.length];
       int i=0;
       int j=0;
       int k=0;
       while(i<n1 && j<n2){
           if(L[i]<R[j]){
               System.out.println(L[i] + R[j]);
               A[k]=L[i];
               i++;
               k++;
           }
           else{
               A[k]=R[j];
               j++;
               k++;
           }
           printArray(A);
           /*while(i<n1){
               A[k]=L[i];
               i++;
               k++;
           }
           while(j<n2){
               A[k]=R[j];
               j++;
               k++;
           }
           */
       }
       printArray(A);
   }
   
   //displays the array in grid fashion
    public void printArray(int [] B){
        System.out.println("------------------");
        System.out.println("index | value");
        for(int i=0;i<B.length;i++){
            System.out.println("|" + i + "   |   " + B[i]+"  |");
        }
        System.out.println("------------------");
        
    }
   
 public static void main(String args[]){
     MergeSort ms=new MergeSort();
     int []A={1,3,5,2,4,6};
     int p=0;
     int q=2;
     int r=A.length-1;        
     ms.merge(A, p,q,r);
 }   
}
