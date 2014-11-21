/*
Jonah Tan, 54079794, LC2
*/
import java.util.Scanner;

class AdvancedQuadraticCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
		Double a = sc.nextDouble();
		System.out.print("Enter coefficient b: ");
		Double b = sc.nextDouble();
		System.out.print("Enter coefficient c: ");
		Double c = sc.nextDouble();

		if(a == 0 || b == 0 || c == 0){
			System.out.println("Invalid Input");
			return;
		}

		System.out.println("\nSolving "+a+"x^2"+" + "+b+"x"+" + "+c+" = 0");

		Double discriminant = Math.pow(b,2)-(4*a*c);
		b *= -1;

		if(discriminant > 0){
			Double x1 = ((b + Math.sqrt(discriminant))/(2*a));
			Double x2 = ((b - Math.sqrt(discriminant))/(2*a));
			System.out.println("Two distinct solutions:\n\n"+"x = "+x1+" &\nx = "+x2);
		}

		else if(discriminant == 0){
			Double x = (b)/(2*a);
			System.out.println("Repeated solution: x = "+x);
		}

		else if(discriminant < 0){
			System.out.println("No real solution exists.");
		}
    }
}