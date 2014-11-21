/*
Jonah Tan, 54079794, LC2
*/
import java.util.Scanner;

class CourseSplitter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course string: ");
		String courseString = sc.nextLine();

        System.out.println("Division: "+courseString.substring(0, 3));
        System.out.println("Course Code: "+courseString.substring(4, 10));
        System.out.println("Course Description: "+courseString.substring(10));
    }
}