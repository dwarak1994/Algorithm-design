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
public class BinarySearch {
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
    public static void BinarySearch(int n){
        int lowindex=0;
        int j = 0;
        while(n!=ar[j]){
        int highindex=ar.length-1;
         j=(lowindex+highindex)/2;
            if(n<ar[j]){
            lowindex=0;
            highindex=j;
        }
        else{
            lowindex=j;
            highindex=ar.length-1;
        }
    }
        System.out.println("----");
    System.out.print(j);
    }
    public static void main(String args[]){
      
        randomarray();
        Bubblesort();
        printarray();
        BinarySearch(9);
    }
}

/*
proper implementation
binarysearch(int n)
while(ar[lowindex)<ar[highindex]){
if(n<ar[middleindex]) highindex=middleindex-1;
else if(n>ar[middleindex]) lowindex=middleindex+1;
else {print value}
break the loop lowindex=highindex+1;



*/
