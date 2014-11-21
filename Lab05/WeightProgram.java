/*
Jonah Tan, 54079794, LC2
*/
import java.util.Scanner;
class WeightProgram {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);

        System.out.print("Enter number of apples to buy:");
        Double apples = input.nextDouble();
        Double applesweight = apples*103;

        System.out.print("Enter number of mangos to buy:");
        Double mangos = input.nextDouble();
        Double mangosweight = mangos*110;

        Double total = mangosweight+applesweight; //The following block of code defines the different weights and how many times they each must be used.
        Double a = Math.floor(total / 100);
        total = total - a*100;
        Double b = Math.floor(total / 50);
        total = total - b*50;
        Double c = Math.floor(total / 20);
        total = total - c*20;
        Double d = Math.floor(total / 10);
        total = total - d*10;
        Double e = Math.floor(total / 5);
        total = total - e*5;
        Double f = Math.floor(total / 1);

        System.out.println("100g-weight:"+a);
        System.out.println("50g-weight:"+b);
        System.out.println("20g-weight:"+c);
        System.out.println("10g-weight:"+d);
        System.out.println("5g-weight:"+e);
        System.out.println("1g-weight:"+f);
    }
}