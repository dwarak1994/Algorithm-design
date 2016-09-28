/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;

/**
 *
 * @author dwaraknath
 */
public class Refractoring4 {
    public String item;
    public int price;
    public double shippingcost;
    public int quantity;
    public String getitem(){return item;}
    public int getprice(){ return price;}
    public int getquantity(){return quantity;}
    public double getshippingcost(){ return shippingcost; }
    public Refractoring4(String item,int price,double shippingcost,int quantity){
        this.item=item;
        this.price=price;
        this.shippingcost=shippingcost;
        this.quantity=quantity;
    }
    public double getTotalprice(){
        double discount=0.0;
        final boolean over50=(quantity>50) || ((quantity*price)>500); 
        final boolean over20=(quantity>20) || ((quantity*price)>200);
        final boolean over10=(quantity>10) || ((quantity*price)>100);
        if(over50){ discount=0.1; }
        else if(over20){ discount =0.07; }
        else{ discount =0.05;}
        double finalamount= price-(price*discount);
        return finalamount;
                }
}

class Store{
    
    public ArrayList<Refractoring4> product=new ArrayList<Refractoring4>();
    public void addproduct(Refractoring4 ref){
        product.add(ref);
    }
    public void getCostprice(){
        for(Refractoring4 x: product){
            System.out.println("item" + x.getitem());
            System.out.println("price" + x.getTotalprice());
            System.out.println("quantity" + x.getquantity());
                        
        }
    }
    public static void main(String args[]){
        Store store = new Store();
        store.addproduct(new Refractoring4("pens",10,1.0,52));
        store.getCostprice();
        
    }
}