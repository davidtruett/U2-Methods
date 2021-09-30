import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static int clickCount = 0;
    static JLabel clickCountLabel;
    static JLabel explosion;
    static JTextField input;

    public static void main(String[] args) {
        JFrame window = new JFrame("clicker explosion");
        JPanel panel = new JPanel();
        clickCountLabel = new JLabel("click count: ");
        explosion = new JLabel();
        JLabel inputLabel = new JLabel("enter product name: ");
        input = new JTextField(15);
        JButton button = new JButton("click4explosion");

        window.setSize(250,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(inputLabel);
        panel.add(input);
        panel.add(clickCountLabel);
        panel.add(button);

        window.add(panel);

        window.setVisible(true);

    }
    private static class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String product = input.getText();
            clickCount++;
            clickCountLabel.setText("Sold: " + clickCount + " number of " + product);


        }

    }


}
