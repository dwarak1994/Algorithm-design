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
public class Refracting1 {
    private static String name;
    private static float runs;
    private static float balls;
    private static float bowled;
    private static float wickets;
    public static float strikerate;
   // private static double strike_rate;
   
    public Refracting1(String name,float runs,float balls,float bowled,float wickets){
        this.name=name;
        this.runs=runs;
        this.balls=balls;
        this.wickets=wickets;
        this.bowled=bowled;
    }
    
    //creating batsman method and returning the refracting object
    public static Refracting1 Batsman(String name,float runs,float balls){
        
        return new Refracting1(name,runs,balls,0,0);
        
    }
    public float Strikerate(){
        strikerate=(runs)/balls;
        
        return strikerate;
        
    }
    public String name(){
        return name;
    }
    public static void main(String args[]){
        Refracting1 b=new Refracting1("kohli",100,92,2,1);
        System.out.println(b.Strikerate());
        Refracting1 c=Refracting1.Batsman("dhoni", 105, 81);
        
        System.out.println(c.Strikerate());
        
    }
}
