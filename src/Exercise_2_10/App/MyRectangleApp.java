package Exercise_2_10.App;

import Exercise_2_10.Data.MyRectangle;
import Exercise_2_6.Data.MyPoint;

public class MyRectangleApp {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(0, 0, 2, 3);
        MyRectangle rectangle2 = new MyRectangle(new MyPoint(1, 1), new MyPoint(4, 5));

        // Test toString() method
        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Rectangle 2: " + rectangle2);

        // Test getArea() and getPerimeter() methods
        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());

        System.out.println("Area of Rectangle 2: " + rectangle2.getArea());
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.getPerimeter());
    }
}
