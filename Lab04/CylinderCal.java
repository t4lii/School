/*
Jonah Tan, 54079794, LC2

The formula I used for the surface area of the cylinder was "A=2πrh+2πr^2" instead of the one supplied which was "2πrh".
*/
import java.util.Scanner; // This imports the Scanner utitility which is used to listen for user input
public class CylinderCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Please enter the height of the cylinder: ");
        double height = input.nextDouble();
        
        double area = 2 * Math.PI * radius * height + (2 * Math.PI * Math.pow(radius, 2)); // 2πrh+2πr^2 is saved as a double called "area"
        double volume = Math.PI * Math.pow(radius,2) * height; // πr^2h is saved as a double called "volume"

        System.out.println("Surface area is " + area); //The surface area is echoed
        System.out.println("Volume is " + volume); //The volume is echoed
    }
}