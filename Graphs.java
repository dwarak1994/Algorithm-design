/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dwaraknath
 */
public class Graphs {
    BufferedReader br;
    public int adjMat[][];
    public final int nodes=6;
      Scanner sc;
    public Graphs() throws FileNotFoundException, IOException{
        this.adjMat =  new int[nodes][nodes];
        this.sc = new Scanner("graph.txt");
       // this.br = new BufferedReader(new FileReader("graph.java"));
      
        
       // ReadNodes();
    }
    public void ReadNodes() throws IOException{
        
        for(int i=0;i<nodes;i++){
            for(int j=0;j<nodes;j++){
                if(i==j){
                    adjMat[i][j]=0;
                }
                else{
                    adjMat[i][j]=1000;
                }
            }
        }
       while(sc.hasNextInt()){
           int x=sc.nextInt();
           System.out.println(x);
           int y=sc.nextInt();
           adjMat[x][y]=sc.nextInt();
       }
    }
    public void printMatrix(){
        for(int i=0;i<nodes;i++){
            for(int j=0;i<nodes;j++){
                System.out.println(" ADJ Mat " + i + j + adjMat[i][j] );
            }
        }
    }
    public void Scanfile(File file) throws FileNotFoundException{
        Scanner scanner=new Scanner(file);
        while(scanner.hasNextInt()){
            int a=sc.nextInt();
        }
    }
    
    public static void main(String args[]) throws IOException{
        Graphs g=new Graphs();
        System.out.println("reading file");
        g.ReadNodes();
        g.printMatrix();
    }
    
}
