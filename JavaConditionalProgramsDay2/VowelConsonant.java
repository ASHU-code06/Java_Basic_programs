package JavaConditionalProgramsDay2;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String args[]){
        System.out.println("Enter an albhabet");
        Scanner input = new Scanner(System.in);
        //Using next().charAt(0) to Accept Char Input and 0 means only single char is being input
        char albhabet=input.next().charAt(0);
        check(albhabet);
    }
    public static void check(char albhabet){
        switch (albhabet){
            case 'a':
                System.out.println("It is a vowel");
                break;
            case 'e':
                System.out.println("It is a vowel");
                break;
            case 'i':
                System.out.println("It is a vowel");
                break;
            case 'o':
                System.out.println("It is a vowel");
                break;
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonant");

        }
    }
}
