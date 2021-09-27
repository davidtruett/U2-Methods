import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame
{

    public static void main(String[] args) {
        JFrame window = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click4Cookie!");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(button);
        window.add(panel);
        window.setVisible(true);
    }
    static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "HERE'S A COOKIE!");
        }
    }
}
