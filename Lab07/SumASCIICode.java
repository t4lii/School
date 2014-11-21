/*
Jonah Tan, 54079794, LC2
*/
import java.util.Scanner;

class SumASCIICode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-character string: ");
        String str = sc.next();

        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);
        char d = str.charAt(3);
        int val = a + b + c + d;

        System.out.println("Value of the string is: " + val);
    }
}