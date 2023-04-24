import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wood> woods = new ArrayList<Wood>();
        for(int i=2;i<=10;i+=2){
            for(int j=i; j<=10;j+=2){

                woods.add(new Wood(i,j));
            }
        }
        String[][] data = new String[woods.size()][5];
        for (int i = 0; i < woods.size(); i++) {
            data[i][0] = Integer.toString(woods.get(i).getBase());
            data[i][1] = Integer.toString(woods.get(i).getHeight());
            data[i][2] = Integer.toString(woods.get(i).getCrossSectionalArea());
            data[i][3] = Double.toString(woods.get(i).getMomentOfIntertia());
            data[i][4] = Double.toString(woods.get(i).getSectionModules());
        }
        var f = new JFrame();
        var j = new JTable();
        f.setTitle("Results");
        String[] columnNames = {"Base", "Height", "CSA", "MoI", "SM"};
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);


    }
}