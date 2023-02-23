package com.logicalproblems;

import java.util.Scanner;

public class PrimeElementsInArray {
    public static void main(String[] args) {
        System.out.println("An Array of number 1 to n");
        System.out.println("Enter the size(n) of array");
        int n = new Scanner(System.in).nextInt();
        int array[]= new int[n];
        for(int a = 0;a < array.length; a++){
            array[a]=a+1;
            System.out.print(" "+array[a]);
        }
        System.out.println("\nPrime numbers are : ");
        System.out.print(" 1 2");
        for (int i=3;i<= array.length;i++){
            isprime(i);
        }

    }
    static void isprime(int number){

        int count = 0;
        for(int i =2;i<number;i++){
            if (number%i==0){
                count ++;
                break;
            }
        }
        if (count==0){
            //is a prime number
            System.out.print(" "+number);
        } else {
            System.out.print("");
            //No it is not a prime number
        }
    }
}
