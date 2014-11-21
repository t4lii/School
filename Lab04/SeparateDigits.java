/*
Jonah Tan, 54079794, LC2

I was feeling brave so I made it work for an integer of any length. ＼(^ω^＼) 
*/
import java.util.Scanner; // This imports the Scanner utitility which is used to listen for user input
import java.math.BigInteger; // Java doesn't like big integers natively so I import BigInteger so it works for larger numbers
class SeparateDigits {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter an integer: "); //Ask the user for an integer
        BigInteger digits = input.nextBigInteger();
        int strlen = String.valueOf(digits).length(); //Save the length of their integer to "strlen"
        
        System.out.print("Digits in "+digits+" are ");
        for(int i=1; i<strlen; i++){ //Increment i when i is less that the length of their integer
              System.out.print(String.valueOf(digits).charAt(i)+"   "); //Echo each individual digit with 3 spaces after it
         }
    }
}