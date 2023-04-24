import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList outStandingScores = new ArrayList();
        ArrayList satisfactoryScores = new ArrayList();
        ArrayList unSatisfactoryScores = new ArrayList();
        JTextField scoreField = new JTextField(5);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Score:"));
        panel.add(scoreField);
        while (true) {
            scoreField.setText("");
            var res = JOptionPane.showConfirmDialog(null, panel,
                    "Please Type The Scores", JOptionPane.OK_OPTION);
            if (res == 1) {
                break;
            }
            int number = 0;
            try {
                number = Integer.parseInt(scoreField.getText());
            } catch (Exception e) {
                continue;
            }
            if (number <= 100 && number >= 90) {
                outStandingScores.add(number);
                continue;
            }
            if (number <= 89 && number >= 60) {
                satisfactoryScores.add(number);
                continue;
            }
            unSatisfactoryScores.add(number);
        }
        String outstandingResults = "";
        String satisfactoryResults = "";
        String unSatisfactoryResults = "";
        for (var item :
                outStandingScores) {
            outstandingResults += item + ",";
        }
        for (var item :
                satisfactoryScores) {
            satisfactoryResults += item + ",";
        }
        for (var item :
                unSatisfactoryScores) {
            unSatisfactoryResults += item + ",";
        }
        panel = new JPanel();
        panel.add(new JLabel("OutStanding Scores:"));
        panel.add(new Label(outstandingResults));
        panel.add(Box.createHorizontalStrut(15));
        panel.add(new JLabel("Satisfactory Scores:"));
        panel.add(new Label(satisfactoryResults));
        panel.add(Box.createHorizontalStrut(15));
        panel.add(new JLabel("UnSatisfactory Scores:"));
        panel.add(new Label(unSatisfactoryResults));
        JOptionPane.showMessageDialog(null, panel);
    }
}