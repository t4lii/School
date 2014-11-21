/*
Jonah Tan, 54079794, LC2
*/
import javax.swing.JOptionPane;

class DayOfWeekGUI {
    public static void main(String[] args){
    	int day = Integer.parseInt(JOptionPane.showInputDialog("Enter day "));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter month "));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year "));

        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14-month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;

        JOptionPane.showMessageDialog(null, "The day of the week is " + d);
    }
}