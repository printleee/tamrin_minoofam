import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt( JOptionPane.showInputDialog("Enter x: "));
        int y = Integer.parseInt( JOptionPane.showInputDialog("Enter y: "));
        int z = Integer.parseInt( JOptionPane.showInputDialog("Enter z: "));
        // x pow y then y pow x in parentheses , / by abs z
        double res1 = (Math.pow(x,y) + Math.pow(y,x))/Math.abs(z);
        // neper pow y - log ( x * z )
        double res2 = Math.exp(y)-Math.log(x*z);
        // max between x & y % min between y & z
        double res3 = Math.max(x,y)%Math.min(y,z);
        double first = Math.round(res1);
        double second = Math.floor(res2);
        double third = Math.ceil(res3);

        JOptionPane.showMessageDialog(null,"first one rounded  = "+ first + "\nsecond one rounded down = " + second + "\nthird one rounded up = " + third);

    }
}