import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    //take an array of 1to100(array1) numbers then find prime numbers from this array and make a array(array2) containing only prime numbers
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int array[]=new int[200];
        System.out.println("Array of numbers : ");
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]=i+1);
        }
        System.out.println("Prime numbers are : ");
        for (int j=0;j<array.length;j++){
            isprime(j+1);
        }
    }
    static void isprime(int num){

        //0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
        int count = 0 ;
        for (int i=2;i<num/2;i++){
            if (num%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.print(" "+num);
        }

    }
}
