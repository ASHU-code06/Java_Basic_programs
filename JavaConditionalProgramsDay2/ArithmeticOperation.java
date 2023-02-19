package JavaConditionalProgramsDay2;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String args[]){
       // float swap=0.0F;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        float a=input.nextFloat();
        System.out.println("Enter second number");
        float b=input.nextFloat();
        System.out.println("Enter third number");
        float c=input.nextFloat();
        float result1=operation1(a,b,c);
        float result2=operation2(a,b,c);
        float result3=operation3(a,b,c);
        float result4=operation4(a,b,c);
        float array[]=new float[4];
        array[0]=result1;
        array[1]=result2;
        array[2]=result3;
        array[3]=result4;
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++) {
                if (array[i] < array[j]) {
                    float swap = array[j];
                    array[j] = array[i];
                    array[i] = swap;
                }
            }
        }
        System.out.println("Greatest result is "+array[0]);
        System.out.println("Smallest result is "+array[3]);
    }

    private static float operation4(float a, float b, float c) {
       float op4=a*b+c;
        System.out.println("The result of operation a*b+c is "+op4);
        return op4;
    }

    private static float operation3(float a, float b, float c) {
        float op3=a%b+c ;
        System.out.println("The result of operation a%b+c  is "+op3);
        return op3;
    }

    private static float operation2(float a, float b, float c) {

        float op2=c+a/b;
        System.out.println("The result of operation c+a/b is "+op2);
        return op2;
    }

    private static float operation1(float a, float b, float c) {
        float op1=a+b*c;
        System.out.println("The result of operation a+b*c is "+op1);
        return op1;
    }
}
