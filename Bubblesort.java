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
public class Bubblesort {
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
    public static void Bubblesort(){
        for(int i=ar.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(ar[i]<ar[j]){
                    Swapvalues(i,j);
                }
            }
        }
    }
    private static void Swapvalues(int i, int j) {
        int k=ar[j];
        ar[j]=ar[i];
        ar[i]=k;
        
    }
    
    
    public static void main(String args[]){
        randomarray();
        printarray();
        long t=System.currentTimeMillis();
        Bubblesort();
        System.out.println(System.currentTimeMillis()-t);
        System.out.println("------------");
        printarray();
    }

    
}
