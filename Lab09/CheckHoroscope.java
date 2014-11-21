/*
Jonah Tan, 54079794, LC2
*/
import java.util.Scanner;

class CheckHoroscope {
    public static void main(String[] args){
    	String[] horoscope = new String[12];
    	horoscope[0] = "Rat";
    	horoscope[1] = "Cow";
    	horoscope[2] = "Tiger";
    	horoscope[3] = "Rabbit";
    	horoscope[4] = "Dragon";
    	horoscope[5] = "Snake";
    	horoscope[6] = "Horse";
    	horoscope[7] = "Goat";
    	horoscope[8] = "Monkey";
    	horoscope[9] = "Rooster";
    	horoscope[10] = "Dog";
    	horoscope[11] = "Pig";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
		int year = sc.nextInt();
		int sign = (year - 4) % 12;

        System.out.println("Your horoscope sign: "+horoscope[sign]);
    }
}