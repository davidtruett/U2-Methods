import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

//MY ATTEMPT

/*
    public static void main(String[] args) {
        String word1 = "Technology";
        String word2 = "Cheese";
        String word3 = "Alphabet";
        System.out.println(lastThree(word1, word2, word3));
    }

    public static String lastThree(String word1, String word2, String word3){
        String l3w1 = word1.substring(8, 10);
        String l3w2 = word1.substring(4, 6);
        String l3w3 = word1.substring(6, 8);
        String newWord = l3w1 + l3w2 + l3w3;
        return newWord;
    }
 */

//LAW'S ATTEMPT

    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Enter word1: ");
        String word2 = JOptionPane.showInputDialog("Enter word2: ");
        String word3 = JOptionPane.showInputDialog("Enter word3: ");

        String output = lastThree(word1) + lastThree(word2) + lastThree(word3);

        JOptionPane.showMessageDialog(null, output);

        System.exit(0);

    }

    public static String lastThree(String word){
        String newWord;

        if(word.length() <=3){
            newWord = word;
        }else {
            newWord = word.substring(word.length()-3);
        }

        return word.substring(word.length()-3);
    }

}
