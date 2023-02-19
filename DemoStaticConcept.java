public class DemoStaticConcept {
    static int var=1234;
    static String var1="This is a static variable";
    static char var2='S';

    static {
        System.out.println("Welcome to static block. It is the first thing to be executed ");
    }
    public static void main(String args[]){
        System.out.println("This is a static method");
        System.out.println("Static variables are : \n"+var1+"\n"+var+"\n"+var2);
    }}
