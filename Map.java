/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author dwaraknath
 */
public class Map {
    public static void main(String args[]){
        HashMap m1=new HashMap();
        System.out.println(m1.isEmpty());
        m1.put(7, 9);
        m1.put(7,8);
        System.out.print(m1.isEmpty());
    }
    
}
