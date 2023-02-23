package com.logicalproblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int count = 0;
       for(int i =2;i<number;i++){
           if (number%i==0){
               count ++;
               break;
           }
       }
       if (count==0){
           System.out.println("\n"+number+" is a prime number ");
       } else {
           System.out.println("No it is not a prime number ");
       }


    }
}
