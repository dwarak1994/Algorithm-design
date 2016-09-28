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
//Algorithm for quick sort
public class SortQuick {
    
    public void sort(int []A, int p,int q){
        System.out.println("p is " + p);
        System.out.println("q is " + q);
            if(p<q ){
                int pivot=partitioning(A,p,q);
                sort(A,p,pivot-1);
                printArray(A);
                sort(A,pivot+1,q);
                printArray(A);
            }
        
    }
    public int partitioning(int []A,int p,int r){
        int pivot_value=A[r];
        int i=p-1;
        for(int j=p;j<r-1;j++){
            if(A[j] <= pivot_value){
                i++;
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        System.out.println(i+1);
        int tem=A[i+1];
        A[i+1]=A[r];
        A[r]=tem;
        return i+1;
    }
    public void Swap(int []A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    //displays the array in grid fashion
    public static void printArray(int [] B){
        System.out.println("------------------");
        System.out.println("index | value");
        for(int i=0;i<B.length;i++){
            System.out.println("|" + i + "   |   " + B[i]+"  |");
        }
        System.out.println("------------------");
        
    }
    public static void main(String arg[]){
     SortQuick qs=new SortQuick();
     int []A={1,3,4,6,7,29};
     qs.sort(A, 0, A.length-1);
     printArray(A);
    }
    
}
