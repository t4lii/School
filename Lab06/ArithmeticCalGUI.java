/*
Jonah Tan, 54079794, LC2
*/
import javax.swing.JOptionPane;

public class ArithmeticCalGUI { 
    public static void main(String[] args) { 
        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first integer"));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second integer"));
        JOptionPane.showMessageDialog(null, "Sum is " + (number1 + number2));
        JOptionPane.showMessageDialog(null, "Difference is " + (number1 - number2));
        JOptionPane.showMessageDialog(null, "Product is " + (number1 * number2));
        JOptionPane.showMessageDialog(null, "Quotient is " + (number1 / number2));
    } 
}