import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double num1 = Integer.parseInt(JOptionPane.showInputDialog("enter first numerator :  "));
        double denum1 = Integer.parseInt(JOptionPane.showInputDialog("enter first denominator  :  "));
        double num2 = Integer.parseInt(JOptionPane.showInputDialog("enter second numerator :  "));
        double denum2 = Integer.parseInt(JOptionPane.showInputDialog("enter first denominator  :  "));
        double numRes = num1 * num2;
        double denumRes = denum1 * denum2;
        JOptionPane.showMessageDialog(null,"result of multiplication : " + numRes + "/" + denumRes + "\n Or: " + numRes / denum2);
    }
}