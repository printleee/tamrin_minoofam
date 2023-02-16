import javax.swing.*;

public class Conv {
    public static void main(String[] args) {
        String inSec = JOptionPane.showInputDialog(" enter seconds :");
        int seconds = Integer.parseInt(inSec);
        int realSec = seconds % 60;
        int mins = seconds / 60;
        int realMins = mins % 60;
        int hours = mins / 60;
        String conv = hours + " hours, " + realMins + " minutes, " + realSec + " seconds ";
        JOptionPane.showMessageDialog(null,conv);


    }
}
