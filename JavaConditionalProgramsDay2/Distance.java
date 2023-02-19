package JavaConditionalProgramsDay2;

public class Distance {
    public static void main(String args[]){
        int x,y;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        System.out.println("Java Program that takes two integer command-line arguments x("+x+") and y("+y+") and prints the Euclidean distance from the point (x, y) to the origin (0, 0). ");
        double value1;
        value1 = Math.pow(x,2);
        double value2;
        value2 = Math.pow(y,2);
        double finalValue = value1+value2;
        double result = Math.sqrt(finalValue);//distance = sqrt(x*x + y*y).
        System.out.println(result);

    }
}
