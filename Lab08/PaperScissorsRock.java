/*
Jonah Tan, 54079794, LC2
*/
import java.util.Scanner;

public class PaperScissorsRock { 
    public static void main(String[] args) { 
    	Scanner input = new Scanner(System.in);
        String[] choice;
        choice[0] = "paper";
        choice[1] = "scissors";
        choice[2] = "rock";


        System.out.print("Paper, Scissors, Rock\nEnter 0 for paper, 1 for scissors, or 2 for rock (-1 to quit):");
        int user = input.nextInt();
        int cpu = (int)(Math.random()*2); 
        System.out.println("Player picks "+choice[user]);
        System.out.println("Computer picks "+choice[cpu]);

        if(user == 0){
           System.out.print( 
        }
    } 
}