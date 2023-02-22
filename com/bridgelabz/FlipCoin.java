package com.bridgelabz;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int countTails=0;
        int countHeads=0;
        System.out.println("Java Program Of Flip Coin and print percentage of Heads and Tails");
        Random run = new Random();

        int totalOutcomes = 10;
        float denominator = totalOutcomes;
        while(totalOutcomes>0)
        {
            float flip = run.nextFloat(1) ;
            System.out.println(flip+"So\n");
             if (flip < 0.5 ){
                 System.out.println("Tails");
                 countTails++;
             } else if (flip > 0.5) {
                 System.out.println("Heads");
                 countHeads++;
             }
             totalOutcomes--;
        }
        float percentOfTails = 0 ;
        float percentOfHeads = 0 ;
        percentOfTails = (countTails/denominator)*100;
        percentOfHeads = (countHeads/denominator)*100;
        System.out.println("Percentage of Tails is "+percentOfTails+" %");
        System.out.println("Percentage of Heads is "+percentOfHeads+ " %");
    }
}