package JavaConditionalProgramsDay2;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String args[]){
        System.out.println("Enter a number");
        int num=new Scanner(System.in).nextInt();
        int pallind=reversethenumber(num);
        if (num==pallind){
            System.out.println("Yes it is a pallindrome");
        }else {
            System.out.println("No it is a pallindrome");
        }

    }

    private static int reversethenumber(int number) {
        int reverse =0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println(reverse);
        return reverse;
    }
}
