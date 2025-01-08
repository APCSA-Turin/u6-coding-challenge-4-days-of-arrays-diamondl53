package com.example.project;
import java.util.Random;

public class Day4 {
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};
    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distance;
        private int seconds;

        
        int total = runDuration+restDuration;
        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;

        }

        public int getRunDuration(){
            return runDuration;
        }

        public int getRestDuration(){
            return restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distance;
            
            
        }
        

        public void simulateSecond(){ //this method is required but not tested
           
           
             int r = seconds%(runDuration+restDuration);
             if(r>=0&&r<runDuration){
                distance += speed;
                seconds++;
            }else{
                seconds++;
            }
        }

        public String getName(){
            return name;
        }

        

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int max = 0;
        int compareDistance = 0;
        String nameWinner = "";
        for(int i = 0; i < reindeers.length; i++){
            for(int k = 0; k < time; k++){
                reindeers[i].simulateSecond();
            }
            compareDistance = reindeers[i].getDistanceTraveled();
            if(compareDistance > max){
                max = compareDistance;
                nameWinner = reindeers[i].getName();
            }
        }
        return nameWinner;
    }

    

    
    public static void main(String[] args) { // for testing purposed
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 70, 6, 1)
        };
        String winner = Day4.simulateRace(100, reindeers);
        System.out.println(winner);

    }

 
}



