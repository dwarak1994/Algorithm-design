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
public abstract class Customer {
    public String custRatings;
    public int Primeir=2;
    public int Deadbeat=0;
    public int valued=1;
    
   public void setcustRatings(String custRatings){
        this.custRatings=custRatings;
    }
    public String getcustRatings(){
        return custRatings;
    }
    
    public static void main(String args[]){
        
    }
}
class Deadbeat extends Customer{

    public Deadbeat() {
        setcustRatings("Deadbeat");
    }
    
        
    }


class Premier extends Customer{
    public Premier(){
        setcustRatings("Premier");
}
}
class Valued extends Customer{
    public Valued(){
        setcustRatings("Valued");
    }
}