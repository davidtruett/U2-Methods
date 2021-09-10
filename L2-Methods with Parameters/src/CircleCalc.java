import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        //create and run the program
        double radius = Double.parseDouble(JOptionPane.showInputDialog("enter radius"));
        area(radius);
        parameter(radius);
    }

    //re-write the method to calculate a circle's area using parameters
    public static void area(double radius) {
        DecimalFormat round = new DecimalFormat("#.##");
        
        double area = radius * radius * Math.PI;

        JOptionPane.showMessageDialog(null, "the area is: " + round.format(area));

    }

    //re-write the method to calculate a circle's perimeter using parameters
    public static void parameter(double radius) {
        DecimalFormat round = new DecimalFormat("#.##");

        double circumference = 2 * Math.PI * radius;

        JOptionPane.showMessageDialog(null, "the circumference is: " + round.format(circumference));

    }

}
