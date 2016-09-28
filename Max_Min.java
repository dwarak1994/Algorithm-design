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
public class Max_Min {
    
    public int Min(int A[]){
        int min=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
        return min;
    }
    
    public int Max(int A[]){
        int max=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
    
    public void min_max(int []A){
        int n=A.length;
        if(n%2==1){
            int min=A[0];
            int max=A[0];
            int bmin=0;
            int bmax=0;
            for(int i=1;i<A.length-1;i=i+2){
                if(A[i]<A[i+1]){
                    bmin=A[i];
                    bmax=A[i+1];
                }
                else{
                    bmin=A[i+1];
                    bmax=A[i];
                }
                if(bmin<min){
                    min=bmin;
                }
                if(bmax>max){
                    max=bmax;
                }
            }
            System.out.println(max + " is bmax " + min + " is bmin");
        }
        if(n%2==0){
            int min=A[0];
            int max=A[1];
            int bmin=0;
            int bmax=0;
            if(A[0]<A[1]){
                bmin=A[0];
                bmax=A[1];
            }
            else{
                bmin=A[1];
                bmax=A[0];
            }
            for(int i=2;i<A.length-1;i=1+2){
                if(A[i]<A[i+1]){
                    bmin=A[i];
                    bmax=A[i+1];
                }
                else{
                    bmin=A[i+1];
                    bmax=A[i];
                }
                if(bmin<min){
                    min=bmin;
                }
                if(bmax>max){
                    max=bmax;
                }
            }
            System.out.println(max + " is bmax " + min + " is bmin");
        }
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
        Max_Min mm=new Max_Min();
        int A[]={1,3,4,5,6,0};
        mm.min_max(A);
    }
}
