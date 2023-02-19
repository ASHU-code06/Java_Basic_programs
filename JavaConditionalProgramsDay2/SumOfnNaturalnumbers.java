package JavaConditionalProgramsDay2;

import java.util.Scanner;

class SumOfnNaturalnumbers {
    public static void main(String args[]){
        System.out.println("Sum of 'n' natural numbers is 1+2+3+4+5+------------+n");
        System.out.println("Enter value of n");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int number =1;
        int sum=0;
        while(number<=n){
            sum=sum+number;
            number++;
        }
        System.out.println("Sum of natural number Using While Loop upto "+n+" is : "+sum);
        for (int i=number;i<=n;i++){
            sum=sum+number;
        }
        System.out.println("Sum of natural number Using For Loop upto "+n+" is : "+sum);
    }
}
