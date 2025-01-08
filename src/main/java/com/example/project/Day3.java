package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for(int i = 0; i < size; i++){
          for(int y = 0; y < size; y++){
            grid[i][y] = " ";
          }
        }
        int middle = size/2;
        for(int i = 0; i < size; i++){
          grid[i][middle] = "*";
          grid[middle][i] = "*";

        }
        for(int i = 0; i < size; i++){
           int j = i;
           grid[i][j] = "*";
          }
        
        int i = 0;
        for(int z = size-1; z >= 0; z--){
          grid[z][i] = "*";
          i++;
        }
        return grid;
      }
        

    


    

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
    String[][] print = Day3.generateSnowflake(7);
    for(int i = 0; i < 7; i++){
      for(int z = 0; z < 7; z++){
        if(print[i][z].equals("")){
          print[i][z] = " ";
        }
        System.out.print(print[i][z]);
      }
      System.out.println();
    }
    
    }
}
