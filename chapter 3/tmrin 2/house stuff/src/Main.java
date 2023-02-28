import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(67000,2300,0.025);
        House house2 = new House(62000,2500,0.025);
        House house3 = new House(75000,1850,0.020);

        JOptionPane.showMessageDialog(null,"house 1 total cost is :"+house1.totalHouseCost() + "\n house 2 total cost is : " + house2.totalHouseCost()+"\n house 3 total cost is : " + house3.totalHouseCost());

    }
}