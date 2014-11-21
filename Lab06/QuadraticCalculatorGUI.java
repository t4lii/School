/*
Jonah Tan, 54079794, LC2
*/
import javax.swing.JOptionPane;

class QuadraticCalculatorGUI {
    public static void main(String[] args){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of c:"));

        Double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        Double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);

        JOptionPane.showMessageDialog(null, "The two solutions are " + "\nx1 = " +  x1 + "\nx2 = " + x2);
    }
}