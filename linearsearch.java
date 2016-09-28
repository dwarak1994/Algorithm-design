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
public class linearsearch {
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

    
    public static void linearsearch(int n){
        for(int i=0;i<ar.length;i++){
            if(n==ar[i]){
                System.out.println("-------------");
                System.out.println(ar[i]);
                System.out.print(i);
            }
        }
        
    }
    public static void main(String args[]){
        randomarray();
        printarray();
        long t=System.currentTimeMillis();
        linearsearch(5);
        System.out.println(System.currentTimeMillis()-t);
    }
    
}
