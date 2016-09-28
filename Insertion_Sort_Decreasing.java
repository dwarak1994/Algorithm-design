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
public class Insertion_Sort_Decreasing {
    
    public int[] sort(int unsortedarray[]){
        for(int j=unsortedarray.length-1;j>=1;j--){
            int key=unsortedarray[j-1];
            int i=j;
            while(i!=unsortedarray.length & unsortedarray[i]<key){
                unsortedarray[i+1]=unsortedarray[i];
                i=i+1;
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
        Insertion_Sort_Decreasing insertionsort=new Insertion_Sort_Decreasing();
        insertionsort.printarray(array);
        System.out.println("-----------------");
        int [] newarray=insertionsort.sort(array);
        insertionsort.printarray(newarray);
               
        
    }
    
}
