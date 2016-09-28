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
public class Different_methods {
public String first_name;
public String last_name;
public String birthday;
public int postalcode;

public Different_methods(String first_name,String last_name,String birthday,int postalcode){
    this.first_name=first_name;
    this.birthday=birthday;
    this.last_name=last_name;
    this.postalcode=postalcode;
}
public String getFirstname(){
    
    return first_name;
    
}
 public void setpostalcode(int postalcode){
        this.postalcode=postalcode;
    }
public String getLastname(){
    return last_name;
}
    
public static void main(String args[]){
    Address df11=new Address(987,"ap","kurnool");
    Different_methods df1=new Different_methods("dwarak","nath","26/09/94",9087);
    
    System.out.println(df1.birthday);
}
}

class Address{
    public int postalcode;
    public String state;
    public String district;
    
    public Address(int postalcode,String state,String district){
    super();
    this.postalcode=postalcode;
    this.district=district;
    this.state=state;
    }
    public void setpostalcode(int postalcode){
        this.postalcode=postalcode;
    }
    public String getstate(){
        return state;
    }
}