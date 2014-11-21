/*
Jonah Tan, 54079794, LC2
*/
import java.util.Scanner;

public class LeapYear { 
    public static void main(String[] args) { 
    	Scanner input = new Scanner(System.in);

        System.out.print("Leap Year Calculation\nEnter the year:");
        int year = input.nextInt();

		if(year < 0){
    	throw new IllegalArgumentException("Year must be positive."); //Throw an error if the user tries to enter a negative year
		}

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){ //Check the year is divisible by 4 and not 100 except if it is divisible by 400
        	System.out.println(year+" is a leap year\nThe number of days in "+year+" is 366");
        }
        else{
        	System.out.println(year+" is NOT a leap year\nThe number of days in "+year+" is 365");
        }
    } 
}