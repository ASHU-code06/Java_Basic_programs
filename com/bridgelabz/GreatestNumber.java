package com.bridgelabz;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String args[]) {
        System.out.println("Enter three numbers");
        Scanner input = new Scanner(System.in);
        float array[] = new float[3];
        for (int i=0;i< array.length;i++){
            array[i]=input.nextFloat();
        }
        for (int j=0;j< array.length;j++){
            for (int k=j+1;k< array.length;k++){
                if (array[j]<array[k]){
                    float swap = array[j];
                    array[j] = array[k];
                    array[k] = array[j];
                }
            }
        }
        System.out.println("Greatest element is "+array[0]);

    }
}
