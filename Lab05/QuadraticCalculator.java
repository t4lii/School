/*
Jonah Tan, 54079794, LC2
*/
import java.util.Scanner;
class QuadraticCalculator {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);

        System.out.print("Enter a value of 'a':");
        Double a = input.nextDouble();

        System.out.print("Enter a value of 'b':");
        Double b = input.nextDouble();

        System.out.print("Enter a value of 'c':");
        Double c = input.nextDouble();

        Double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        Double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);

        System.out.println(Math.max(x1,x2));
    }
}