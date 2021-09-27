import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {
    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click4Quote!");
        JButton button2 = new JButton("Click4Quote!");
        JButton button3 = new JButton("Click4Quote!");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        button1.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());
        button3.addActionListener(new Button3Listener());

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        window.add(panel);
        window.setVisible(true);
    }
    static class Button1Listener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "this is a quote.");
        }
    }
    static class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "this is quote.");
        }
    }
    static class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "this es un le quote.");
        }
    }

}
