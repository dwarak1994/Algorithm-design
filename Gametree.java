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
public class Gametree {
    node root;
    public void addnode(int key,String name){
        node newnode=new node(key,name);
        if(root==null){
            root=newnode;
        }
        else{
            node focusnode=root;
            node parent;
            while(true){
                parent=focusnode;
                if(key<focusnode.key){
                    focusnode=focusnode.leftchild;
                    if(focusnode==null){
                        parent.leftchild=null;
                        return;
                    }
                }
                else{
                    focusnode=focusnode.rightchild;
                    if(focusnode==null){
                        parent.rightchild=newnode;
                        return;
                    }
                }
            }
        }
        
    }
    public void inorder(node focusnode){
        if(focusnode!=null){
            inorder(focusnode.leftchild);
            System.out.println(focusnode);
            inorder(focusnode.rightchild);
            //System.out.println(focusnode.rightchild);
        }
    }
    public static void main(String args[]){
        Gametree gt=new Gametree();
        gt.addnode(2, "dwarak");
        gt.addnode(23, "gwarak23");
        gt.addnode(22, "dwarak22");
        gt.addnode(07, "dwarak07");
        gt.addnode(32, "dwarak32");
        gt.inorder(gt.root);
    }
}
class node{
    int key;
    String name;
    node leftchild;
    node rightchild;
    node(int key,String name){
        this.key=key;
        this.name=name;
    }
  public String tostring(){
      return key +"has" +name;
  }
}