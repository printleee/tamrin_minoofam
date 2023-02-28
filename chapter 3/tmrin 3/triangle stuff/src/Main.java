import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JTextField mField = new JTextField(3);
        JTextField nField = new JTextField(3);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("m:"));
        myPanel.add(mField);
        myPanel.add(Box.createHorizontalStrut(30));
        myPanel.add(new JLabel("n:"));
        myPanel.add(nField);

        JOptionPane.showConfirmDialog(null, myPanel, "Please Enter m and n Values", JOptionPane.OK_CANCEL_OPTION);

        Pythagoras yarosmom = new Pythagoras(Double.parseDouble(mField.getText()), Double.parseDouble(nField.getText()));


        JOptionPane.showMessageDialog(null, " side one : " + yarosmom.getSide1() + " side two : " + yarosmom.getSide2() + " Hypotenuse  : " + yarosmom.getHypotenuse());

    }
}