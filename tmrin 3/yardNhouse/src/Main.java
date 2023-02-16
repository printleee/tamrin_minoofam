import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int yWidth = Integer.parseInt(JOptionPane.showInputDialog("Enter width of the yard :"));
        int yHeight = Integer.parseInt(JOptionPane.showInputDialog("Enter height of the yard :"));
        int hWidth = Integer.parseInt(JOptionPane.showInputDialog("Enter width of the yard :"));
        int hHeight = Integer.parseInt(JOptionPane.showInputDialog("Enter height of the yard :"));
        int hArea = hHeight*hWidth;
        int yArea = yHeight*yWidth;

        if(hArea > yArea)
        {
            JOptionPane.showMessageDialog(null,"House is bigger than yard");
        }
        else{
            int totalArea = yArea-hArea;
            double seconds = totalArea * 2.3;
            double timeNeeded = seconds /60;
            JOptionPane.showMessageDialog(null,"Total times in minutes would be :" + Double.toString(timeNeeded));
        }

    }
}