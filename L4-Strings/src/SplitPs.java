import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /*
    The plan
    1. Get input
    2. Iso the p
    3. Iso the three letters after the p
    4. Output
     */

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter your word: ");
        JOptionPane.showMessageDialog(null, splitP(word));
        System.exit(0);
    }
    public static String splitP(String word){
        int pIndex = word.indexOf('p');
        String split = word.substring(word.indexOf('p') + 1, pIndex + 4);
        return split;

    }

}
