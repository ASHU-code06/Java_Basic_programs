import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=new Scanner(System.in).nextInt();
        int array[]=new int[n];
        int duplicateArray[]=new int[array.length];
        System.out.println("Enter elements of an array");
        for (int k=0;k<array.length;k++){
            array[k]=obj.nextInt();
        }
        System.out.println("Duplicate elements are : ");
        for (int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if ((array[i]==array[j])&&(i!=j)){
                    duplicateArray[i]=array[j];
                    System.out.println(array[j]);
                }
            }
        }
    }
}
