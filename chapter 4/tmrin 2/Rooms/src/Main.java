import java.util.ArrayList;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JTextField nomField = new JTextField(5);
        JTextField capacityField = new JTextField(5);
        JTextField enrollmentField = new JTextField(5);
        JPanel Panel = new JPanel();
        Panel.add(new JLabel("Class Nom:"));
        Panel.add(nomField);
        Panel.add(Box.createHorizontalStrut(15)); // a spacer
        Panel.add(new JLabel("Capacity:"));
        Panel.add(capacityField);
        Panel.add(Box.createHorizontalStrut(15)); // a spacer
        Panel.add(new JLabel("Enrollment:"));
        Panel.add(enrollmentField);
        ArrayList<Room> rooms = new ArrayList<Room>();
        while (true) {
            nomField.setText("");
            capacityField.setText("");
            enrollmentField.setText("");
            int res = JOptionPane.showConfirmDialog(null, Panel,
                    "Please Enter values", JOptionPane.OK_OPTION);
            if (res == 1) {
                break;
            }
            Room newRoom = new Room(Integer.parseInt(nomField.getText()), Integer.parseInt(capacityField.getText()), Integer.parseInt(enrollmentField.getText()));
            rooms.add(newRoom);
        }
        String[][] data = new String[rooms.size()][5];
        for (int i = 0; i < rooms.size(); i++) {
            data[i][0] = Integer.toString(rooms.get(i).getRoomNom());
            data[i][1] = Integer.toString(rooms.get(i).getCapacity());
            data[i][2] = Integer.toString(rooms.get(i).getEnrollment());
            data[i][3] = Integer.toString(rooms.get(i).getLeftCapacity());
            data[i][4] = Boolean.toString(rooms.get(i).getIsCapacityLeft());
        }
        var f = new JFrame();
        var j = new JTable();
        f.setTitle("Results");
        String[] columnNames = {"RoomNom", "Capacity", "Enrollment", "LeftCapacity", "IsOpen"};
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
}