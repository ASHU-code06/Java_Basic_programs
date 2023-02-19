package JavaConditionalProgramsDay2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        System.out.println("Enter a number");
        int num=new Scanner(System.in).nextInt();
        int reverse;
        reversethenumber(num);
        reversethenumb(num);
    }

    private static void reversethenumber(int number) {
        int reverse =0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
         System.out.println("Reverse of a number Using While Loop is"+reverse);
    }
    private static void reversethenumb(int number) {
        int reverse =0;
        for(;number != 0; number=number/10 )
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reverse of a number Using For Loop is"+reverse);
    }
}
