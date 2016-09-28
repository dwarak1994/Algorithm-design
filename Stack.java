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
public class Stack {
   static int stacksize=10;
  static  int ar[]=new int[stacksize];
  static  int stacktop=-1;
    public static void push(int n){
        Arrays.fill(ar,-1);
        if(stacktop+1<stacksize){
            ar[stacktop+1]=n;
            System.out.println(ar[stacktop+1]);
            stacktop++;
        }
        else{
            System.out.println("no space bro");
        }
    }
    public static void pop(){
        if(stacktop>=0){
            System.out.println(ar[stacktop]);
            ar[stacktop]=-1;
            stacktop++;
        }
    }
   
    
    public static void main(String args[]){
        //Stack stack=new Stack();
        push(10);
        push(12);
       // pop();
       push(13);
       push(15);
       push(14);
       push(8);
       push(80);
       push(85);
       push(83);
       push(48);
       push(84);
       push(18);
       push(18);
       push(81);push(8);push(8);
       
       
       
       
       
    }
    
}
