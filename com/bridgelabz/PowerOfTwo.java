package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String args[]){
        System.out.println("This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.");
        int N = Integer.parseInt(args[0]);
        System.out.println("Value of N is "+N);
        int i=1,power;
        System.out.println("table of the powers of 2 ");
        while(i<=N){
            power = (int) Math.pow(2, i);
            // Without Using Meth fumction -> power = power*2 & take power = 1 ;
            System.out.println(power);
            i++;
        }
    }
}
