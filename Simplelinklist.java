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
public class Simplelinklist {
    int item;
    Simplelinklist next;
    public  Simplelinklist(int item){
        this.item=item;
    }
   /* public Simplelinklist(int item1,Simplelinklist next1){
        item=item1;
        next=next1;
    }*/
  
    
    public static void main(String args[]){
        Simplelinklist l1=new Simplelinklist(10);
       
        l1.next=null;
         Simplelinklist l2=new Simplelinklist(20);
        
        l2.next=l1;
        
         Simplelinklist l3=new Simplelinklist(30);
        
        l3.next=l2;
        
         Simplelinklist l4=new Simplelinklist(40);
        
        l4.next=l3;
        System.out.println(l4.next.next.item);
    }
    
}
