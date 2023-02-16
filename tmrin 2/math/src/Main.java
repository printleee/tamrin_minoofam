import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("enter first numbers: ");
       int num1 = Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("enter second numbers: ");
        int num2 = Integer.parseInt(number2);
        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        JOptionPane.showMessageDialog(null," addition : " + add + " , subtraction : " + sub + " , multiplication : " + mult + " , division : " + div);



    }
}