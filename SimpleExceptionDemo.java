import java.util.Scanner;
public class SimpleExceptionDemo {
    private static int numerator;
    private static int denominator;
    public static void main(String[] args){
        Scanner hello = new Scanner(System.in);
        sim(hello);
        sim(hello);
        hello.close();
    }
    public static void safeDivide(int a, int b){
        try{
            System.out.printf("%d / %d = %d%n", a,b,a/b);
        }catch(ArithmeticException e){
            System.out.printf("%d is not an integer greater than 0!%n",b);
        }finally{
            System.out.println("Operation Complete");
        }
    }
    public static void sim(Scanner hello){
        System.out.println("Enter operand integer number 1: "); 
        numerator= hello.nextInt();
        System.out.println("Enter operand integer number 2: "); 
        denominator = hello.nextInt();
        safeDivide(numerator,denominator);
    }
}
