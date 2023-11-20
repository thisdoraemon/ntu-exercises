package Exercise_2_7.App;

import Exercise_2_6.Data.MyPoint;
import Exercise_2_7.Data.MyLine;

public class MyLineApp {
    public static void main(String[] args) {
        // Create a MyLine object using different constructors
        MyLine line1 = new MyLine(1, 2, 4, 6);
        MyLine line2 = new MyLine(new MyPoint(1, 2), new MyPoint(4, 6));

        // Display information about the lines
        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);

        // Test getter and setter methods
        line1.setBeginX(0);
        line1.setBeginY(0);
        line1.setEndXY(3, 4);

        // Display updated information about the lines
        System.out.println("Updated Line 1: " + line1);

        // Test getLength and getGradient methods
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 2: " + line2.getGradient());
    }
}
