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
public class Link {
    public int sold;
    public String bookname;
    public Link next;
    public Link(int sold,String bookname){
        this.sold=sold;
        this.bookname=bookname;
    }
    public String toString(){
        return bookname;
    }
    public void display(){
        System.out.println("booname: " + bookname + "sold: " + sold);
    }
    public static void main(String args[]){
        linklist thelinklist;
        thelinklist = new linklist();
        thelinklist.insertfirstlink(100, "firstbook");
        thelinklist.insertfirstlink(200, "secondbook");
                thelinklist.display();
        
    }
    static class linklist{
        public Link firstlink;
        linklist(){
            firstlink=null;
        }
        public boolean isempty(){
            return (firstlink==null);
        }
        public void insertfirstlink(int sold,String bookname){
            Link newlink=new Link(sold,bookname);
            newlink.next=firstlink;
            firstlink=newlink;
           
        }
        public void display(){
            Link thelink=firstlink;
            while(thelink!=null){
                thelink.display();
                System.out.println("next link " + thelink.next);
                thelink=thelink.next;
            }
        }
    }
}
