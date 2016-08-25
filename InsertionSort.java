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
public class InsertionSort {
    
    public int[] sort(int [] unsortedarray){
        for(int j=1;j<unsortedarray.length;j++){
            int i=j-1;
            int key=unsortedarray[j];
            while(i>=0 & unsortedarray[i]>key){
                unsortedarray[i+1]=unsortedarray[i];
                i--;
            }
        unsortedarray[i+1]=key;
        }
        return unsortedarray;
    }
    public void printarray(int [] array){
        //to print elements in an sorted array
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String args[]){
        int [] array={1,9,8,4,6,7,2};
        InsertionSort insertionsort=new InsertionSort();
        insertionsort.printarray(array);
        System.out.println("-----------------");
        int [] newarray=insertionsort.sort(array);
        insertionsort.printarray(newarray);
                
    }
}
/*
input and optput
1
9
8
4
6
7
2
-----------------
1
2
4
6
7
8
9
BUILD SUCCESSFUL (total time: 0 seconds)

*/
