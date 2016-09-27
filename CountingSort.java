/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Arrays;

/**
 *
 * @author dwaraknath
 */
public class CountingSort {
//Counting Sort 
//runs in linear time
    
    public void sort(int []A,int k){
        int c[]=new int[k+1];
        Arrays.fill(c, 0);
        printArray(c);
        int B[]=new int[A.length];
        Arrays.fill(B, 0);
        printArray(B);
        for(int i=0;i<A.length;i++){
            c[A[i]]=c[A[i]]+1;
        }
        for(int i=1;i<k+1;i++){
            c[i]=c[i]+c[i-1];
        }
        for(int i=0;i<A.length;i++){
            B[c[A[i]]-1]=A[i];
            c[A[i]]=c[A[i]]-1;
            
        }
        printArray(B);
    }   

        
    
    public int returnMax(int []A){
        int k=0; 
        for(int i=0;i<A.length;i++){
            if(A[i]>k){
                k=A[i];
            }
        }
        return k;
    }
    
    public static void printArray(int [] B){
        System.out.println("------------------");
        System.out.println("index | value");
        for(int i=0;i<B.length;i++){
            System.out.println("|" + i + "   |   " + B[i]+"  |");
        }
        System.out.println("------------------");
        
    }
    public static void main(String args[]){
        CountingSort cs=new CountingSort();
        int []A={2,5,3,0,2,3,0,3};
        int k=cs.returnMax(A);
        cs.sort(A,k);
    }
}
