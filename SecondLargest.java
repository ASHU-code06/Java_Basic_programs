
//WAP to find the 2nd Largest and Smallest from Array, and sort the array in descending order
import java.util.*;

public class SecondLargest {
    public static void main(String[] args){
        SecondLargest secondlargest = new SecondLargest();
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Enter elements");


        for(int i = 0 ; i < array.length ; i++){
            array[i] = input.nextInt();
        }
        secondlargest.sortArray(array);
        secondlargest.sumOfElements(array);
    }

    public void sumOfElements(int[] array){
        int sum = 0;
        for(int i = 0 ;i <= ((array.length-2)/2) ; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of first half elements of array is "+sum);
    }


    public void sortArray(int[] array){

        int temp = 0 ;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i] < array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("array is \n");
        for( int print : array){
            System.out.print(print+" ");

        }

        System.out.println("The second largest element is  "+array[1]);
        System.out.println("The smallest element is "+array[9]);
    }
}



