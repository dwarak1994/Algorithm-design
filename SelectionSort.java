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
public class SelectionSort {
        static int[] ar=new int[10];
    public static void randomarray(){
        for(int i=0;i<ar.length;i++){
            ar[i]=(int)(Math.random()*10);
        }
    }
    public static void printarray(){
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
            //System.out.println();
        }
    }
    public static void SelectionSort(){
        int l=ar.length;
        for(int i=0;i<l-1;i++){
        for(int j=i+1;j<l;j++){
            if(ar[i]<ar[j]){
                int temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
            }
                
        }
    }
    }
   
   public static void main(String args[]){
       randomarray();
       printarray();
       SelectionSort();
       System.out.println("-----------");
       printarray();
   }
}
