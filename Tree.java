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
public class Tree {
    Node root;
    public void addnode(int key,String name){
        Node newnode=new Node(key,name);
        if(root==null){
            root=newnode;
        }
        else{
           Node focusnode=root;
           Node parentnode;
           while(true){
               parentnode=focusnode;
               if(key < focusnode.key){
                   focusnode=focusnode.leftchild;
                   if(focusnode==null){
                       parentnode.leftchild=newnode;
                       return;
                   } 
               }
                   else{
                       focusnode=focusnode.rightchild;
                       if(focusnode==null){
                           parentnode.leftchild=newnode;
                           return;
                       }
                   }
               }
           }
    }
    public void inordertraversal(Node focusnode){
        if(focusnode!=null){
            inordertraversal(focusnode.leftchild);
            System.out.print(focusnode);
            inordertraversal(focusnode.rightchild);
        }
    }
 public static void main(String args[]){
     Tree tree=new Tree();
     tree.addnode(100, "a");
     tree.addnode(120,"b");
     tree.addnode(130,"c");
     tree.addnode(55,"d");
     tree.addnode(70,"e");
     tree.addnode(130,"f");
     tree.inordertraversal(tree.root);
 }   
}
class Node{
    public int key;
    public String name;
    Node leftchild;
    Node rightchild;
    Node(int key,String name){
        this.key=key;
        this.name=name;
    }
    public void display(){
        System.out.println("name is " + name + " key " + key);
    }
}