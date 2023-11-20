package Exercise_2_8.App;

import Exercise_2_6.Data.MyPoint;
import Exercise_2_8.Data.MyCircle;

public class MyCircleApp {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        System.out.println("Circle 1: " + circle1);

        // Test constructor with (x, y, radius)
        MyCircle circle2 = new MyCircle(3, 4, 2);
        System.out.println("Circle 2: " + circle2);

        // Test constructor with MyPoint center and radius
        MyPoint point = new MyPoint(1, 1);
        MyCircle circle3 = new MyCircle(point, 5);
        System.out.println("Circle 3: " + circle3);

        // Test getters and setters
        circle1.setRadius(3);
        System.out.println("Circle 1 radius after setting: " + circle1.getRadius());

        circle2.setCenter(new MyPoint(1, 1));
        System.out.println("Circle 2 center after setting: " + circle2.getCenter());

        // Test area and circumference
        System.out.println("Circle 3 Area: " + circle3.getArea());
        System.out.println("Circle 3 Circumference: " + circle3.getCircumference());

        // Test distance
        System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));
    }
}
