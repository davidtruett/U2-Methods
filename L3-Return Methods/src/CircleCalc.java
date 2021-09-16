import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        //create and run the program
        DecimalFormat round = new DecimalFormat("#.##");
        double radius = Double.parseDouble(JOptionPane.showInputDialog("enter radius"));
        JOptionPane.showMessageDialog(null, "the area is: " + round.format(area(radius)) + " The perimeter is: " + round.format(perimeter(radius)));
        System.exit(0);
    }

    //re-write the method to calculate a circle's area using parameters
    public static double area(double radius) { return radius * radius * Math.PI; }

    //re-write the method to calculate a circle's perimeter using parameters
    public static double perimeter(double radius) { return 2 * Math.PI * radius; }

}

    /*
    1 get input
    2. calculate area
    3. calculate circumference
    4. display results.
     */


