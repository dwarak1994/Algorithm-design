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
public class HeapSort {
//This java class performs Heapsort 
//given an array sorts in decresing order

//Heapify takes array and index, 
//it makes the parent the highest valued than the left child and right child
//it compares indices of left, right and parent and swaps until the parent is highest values    
    public void Heapify(int []A,int i){
        int left=(2*i)+1;
        int right=2*(i+1);
        int largest;
        if(left<A.length && A[left]>A[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        if(right<A.length && A[right]>A[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=A[largest];
            A[largest]=A[i];
            A[i]=temp;
            Heapify(A,largest);
            printArray(A);
        }
        
    }
   
//Build Heap builds the heap 
//starts building heap leaving out the leaves
//it iterates until all parents are higher than its children
    public int[] BuildHeap(int []A){
        int n=A.length;
        int index=(int)(Math.ceil(n/2)-1);
        for(int i=(n/2);i>=0;i--){
            Heapify(A,i);
            
        }
        return A;
    }
    
// this sorts the array
    public int[] sort(int []A){
        int []finalArray=new int[A.length];
        int []temp_A=BuildHeap(A);
        System.out.println("-------temp array");
        printArray(temp_A);
        for(int i=0;i<=A.length-1;i++){
            finalArray[i]=temp_A[0];
            temp_A=splitArray(temp_A);
            Heapify(temp_A,0);
        }
        return finalArray;
    }
    
// this is function for creating temporary array used for splitting the array in sort
    public int[] splitArray(int []A){
        int []Array=new int[A.length-1];
        for(int i=1;i<A.length;i++){
            Array[i-1]=A[i];
        }
        return Array;
    }
    
//return the parent of a node    
    public int parent(int i){
        return (int) (Math.ceil((i-1)/2));
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
    
//main function to call the sorting
    public static void main(String args[]){
        
        HeapSort hs=new HeapSort();
        int []A={1,2,3,4,5,6,7,8,66,13,55,76};
        hs.printArray(A);
        int []B=hs.sort(A);
        hs.printArray(B);
    }
    
}
/*
input and output displayed

------------------
index | value
|0   |   1  |
|1   |   2  |
|2   |   3  |
|3   |   4  |
|4   |   5  |
|5   |   6  |
|6   |   7  |
|7   |   8  |
|8   |   66  |
|9   |   13  |
|10   |   55  |
|11   |   76  |
------------------
------------------
index | value
|0   |   76  |
|1   |   66  |
|2   |   55  |
|3   |   8  |
|4   |   7  |
|5   |   6  |
|6   |   4  |
|7   |   13  |
|8   |   5  |
|9   |   3  |
|10   |   2  |
|11   |   1  |
------------------
BUILD SUCCESSFUL (total time: 0 seconds)

*/

