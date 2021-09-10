import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        //call the area method
       areaMethod();

        //call the circumference method
        circumferenceMethod();

    }

    //write a method to calculate a circle's area
    public static void areaMethod() {
        DecimalFormat round = new DecimalFormat("#.##");
        double radius = Double.parseDouble(JOptionPane.showInputDialog("enter radius"));
        double area = radius * radius * Math.PI;

        JOptionPane.showMessageDialog(null, "the area is: " + round.format(area));

    }

    //write a method to calculate a circle's circumference
    public static void circumferenceMethod() {
        DecimalFormat round = new DecimalFormat("#.##");
        double radius = Double.parseDouble(JOptionPane.showInputDialog("enter radius"));
        double circumference = 2 * Math.PI * radius;

        JOptionPane.showMessageDialog(null, "the circumference is: " + round.format(circumference));

    }
}
