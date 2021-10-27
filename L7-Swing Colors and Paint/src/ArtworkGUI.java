import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;
    Color background = new Color(200,0,200);

    public ArtworkGUI()
    {
        //CREATE THE GUI
        frame = new JFrame("you now have a virus btw");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new ArtworkGUI.MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(background);
        }
        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){

            super.paintComponent(g);
            g.setColor(Color.black);
            g.drawRect(102,106,79,46);
            g.fillRect(200,100,179,56);
            g.drawRect(96,96,96,96);
            g.fillRect(69,69,69,69);
            g.setColor(Color.cyan);
            g.drawRect(64,47,342,100);
            g.fillOval(100,200,300,400);
            g.drawRect(200,200,200,200);
            g.fillRect(69,69,69,69);
            g.setColor(Color.green);
            g.drawRect(620,200,40,40);
            g.fillRect(235,300,420,200);
            g.drawRect(140,128,3,39);
            g.fillRect(270,240,200,188);
            g.setColor(Color.magenta);
            g.drawRect(102,106,79,46);
            g.fillRect(200,100,179,56);
            g.drawRect(53,579,658,356);
            g.fillRect(29,158,60,60);
            g.setColor(Color.white);
            g.drawRect(200,200,200,200);
            g.fillRect(200,200,100,100);
            g.drawRect(250,200,150,150);
            g.fillOval(170,369,120,100);


        }
    }
}
