import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window;
    JPanel panel;
    JButton colorSwitch1;
    JButton colorSwitch2;
    JButton colorSwitch3;

    Color color1 = new Color(36, 200, 2);
    Color color2 = new Color(255, 8, 39);
    Color color3 = new Color(210, 149, 80);


    public ColorSwitchGUI(){
        //create your GUI
        window = new JFrame("Color Switch");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,200);
        window.setLocationRelativeTo(null);

        panel = new JPanel();

        colorSwitch1 = new JButton("Change the colors!");
        colorSwitch2 = new JButton("Change the colors!");
        colorSwitch3 = new JButton("Change the colors!");

        colorSwitch1.addActionListener(new ColorChanger1());
        colorSwitch2.addActionListener(new ColorChanger2());
        colorSwitch3.addActionListener(new ColorChanger3());

        window.add(panel);
        panel.add(colorSwitch1);
        panel.add(colorSwitch2);
        panel.add(colorSwitch3);

        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ColorChanger1 implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(color2);
            colorSwitch1.setForeground(color3);
            colorSwitch1.setBackground(color1);
        }
    }

    private class ColorChanger2 implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(color3);
            colorSwitch2.setForeground(color2);
            colorSwitch2.setBackground(color1);
        }
    }

    private class ColorChanger3 implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(color1);
            colorSwitch3.setForeground(color2);
            colorSwitch3.setBackground(color3);
        }
    }

}