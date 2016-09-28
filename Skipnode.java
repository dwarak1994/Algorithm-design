/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Random;

/**
 *
 * @author dwaraknath
 */
public class Skipnode {
    public Skiplist up;
    public Skiplist down=null;
    public Skiplist left=null;
    public Skiplist right;
    public int key;
    public int height=2;
   // public String value;
    
    public Skipnode(int key){
        this.key=key;
     //   this.value=value;
    }
   
    
}

class Skiplist{
    public Skipnode bottomnode;
    public Skipnode leftnode;
    public Skiplist(){
        bottomnode=null;
        leftnode=null;
    }
    public void insert(int key){
        Skipnode newnode=new Skipnode(key);
        //newnode=bottomnode;
        if (isbottomempty()){
            bottomnode=newnode;
        }
        else{
            Skipnode refnode=bottomnode;
            while(newnode.key>bottomnode.key){
                
                
            }
        }
        
    }
    public boolean isbottomempty(){
        return bottomnode==null;
    }
    public boolean isleftempty(){
        return leftnode==null;
    }
    public int rand(){
        Random rand = null;
        return rand.nextInt(2);
    }
   public static void main(String args[]){
       
   } 
}