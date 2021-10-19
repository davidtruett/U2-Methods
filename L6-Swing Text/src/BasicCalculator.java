import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static JTextField inputField1;
    static JTextField inputField2;
    static JLabel resultLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("calculator");
        JPanel panel = new JPanel();

        JLabel inputLabel1 = new JLabel("");
        JLabel inputLabel2 = new JLabel("");
        inputField1 = new JTextField(18);
        inputField2 = new JTextField(18);

        JButton add = new JButton("+");
        JButton subt = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");

        JLabel resultLabel = new JLabel("0.00");


        window.setSize(250,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        add.addActionListener(new add());

        panel.add(inputField1);
        panel.add(inputLabel1);
        panel.add(inputField2);
        panel.add(inputLabel2);

        panel.add(resultLabel);

        panel.add(add);
        panel.add(subt);
        panel.add(mult);
        panel.add(div);


        window.add(panel);

        window.setVisible(true);

        double num1 = Double.parseDouble(String.valueOf(inputField1));
        double num2 = Double.parseDouble(String.valueOf(inputField2));

        System.exit(0);

    }
    private static class add implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(num1 + num2));

        }

    }
    private static class subt implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(num1 - num2));

        }

    }
    private static class mult implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(num1 * num2));

        }

    }
    private static class div implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(num1 / num2));

        }

    }

}
