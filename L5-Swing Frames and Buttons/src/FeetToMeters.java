import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {
    
    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
        convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
         */

    public static void main(String[] args) {
        JFrame window = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click4Prompt!");
        JButton button2 = new JButton("Click4Conversion!");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        button1.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());

        panel.add(button1);
        panel.add(button2);

        window.add(panel);
        window.setVisible(true);
    }
    static class Button1Listener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            double feet = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of feet: "));
            double result = feet / 3.28;
            JOptionPane.showMessageDialog(null, result + " in meters.");

        }
    }
    static class Button2Listener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            double feet = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of meters: "));
            double result = feet * 3.28;
            JOptionPane.showMessageDialog(null, result + " in feet.");

        }
    }
}
