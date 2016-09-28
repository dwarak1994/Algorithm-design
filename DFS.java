/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author dwaraknath
 */
public class DFS {
       Deque<Integer> stack = new ArrayDeque<Integer>();
       public int pull;

    List<Integer> ar=new ArrayList<Integer>();
   // stack stack1=new stack();
    public Map<Integer,ArrayList<Integer>> adjListsMap;
    public DFS(){
       adjListsMap = new HashMap<Integer,ArrayList<Integer>>();

    }
    public void insert(int s,ArrayList<Integer> arr){
        
        adjListsMap.put(s, arr);
    }
    public void search(int s,int end){
     int start=s;
     ArrayList<Integer> visited=new ArrayList<Integer>();
     while(start!=end){
         visited.add(start);
         if(!visited.contains(start) || !stack.contains(start)){
             if(adjListsMap.containsKey(start))
         stack.addAll(adjListsMap.get(start));
         }
         if(!stack.isEmpty()){
         start=stack.removeLast();
         System.out.println(start);
         }
         else{
             System.out.println("stack is empty");
         }
     }
       System.out.println("goal reached");
    }
    public static void main(String args[]){
        DFS dfs=new DFS();
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        ar1.add(2);
        ar1.add(7);
        ar1.add(8);
        ArrayList<Integer> ar2=new ArrayList<Integer>();
        ar2.add(6);
        ar2.add(3);
        
        
        
        ArrayList<Integer> ar3=new ArrayList<Integer>();
        ar3.add(4);
        ar3.add(5);
         ArrayList<Integer> ar4=new ArrayList<Integer>();
        ar4.add(9);
        ar4.add(12);
        dfs.insert(1,ar1);
        dfs.insert(2, ar2);
        dfs.insert(3, ar3);
        dfs.insert(8,ar4);
        dfs.search(1,5);
    }
   
  }

  
    