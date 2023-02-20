import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        String text =  JOptionPane.showInputDialog("enter text: ");
        String temp =  text;
        int starFinder = temp.indexOf("*");
        String word1 = temp.substring(0,starFinder);
        temp = temp.substring(starFinder+1);
        starFinder = temp.indexOf("*");
        String word2 = temp.substring(0,starFinder);
        temp = temp.substring(starFinder+1);
        starFinder = temp.indexOf("*");
        String word3 = temp.substring(0,starFinder);
        temp = temp.substring(starFinder+1);
        String word4 = temp.substring(0);
        JOptionPane.showMessageDialog(null,"Reversed text : " + word4 + " " + word3 + " "+ word2 +" " + word1 + "\n\n Original text : " + word1 + word2 + word3 + word4);




    }
}