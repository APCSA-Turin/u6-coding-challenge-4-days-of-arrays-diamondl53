
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] sorted = new String[2][names.length];
    
    int niceCount = 0; 
    int naughtyCount = 0; 
    
    
    for (int i = 0; i < names.length; i++) {
        int x = (int)(Math.random() * 2); 
        
        
        if (x == 0) {
            sorted[0][niceCount] = names[i]; 
            niceCount++; 
        } else {
            sorted[1][naughtyCount] = names[i]; 
            naughtyCount++; 
        }
        
    }
    String[][] finalPrint = new String[2][niceCount+naughtyCount];
    
    for(int i = 0; i < niceCount; i++){
        finalPrint[0][i] = sorted[0][i];
    }
    for(int i = 0; i < naughtyCount; i++){
        finalPrint[1][i] = sorted[1][i];
    }
    return finalPrint;
    }
    

        
        
        //you must return a two dimensional string array
    

    public static void main(String[] args) {
        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        String[][] result = Day2.nameSort(names);
        for (int i = 0; i <2; i++){
            for(int j = 0; j < 12; j++){
                System.out.println(result[i][j]);
            }
            System.out.println();
        }
    }
}