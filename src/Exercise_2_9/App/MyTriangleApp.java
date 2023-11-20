package Exercise_2_9.App;

import Exercise_2_6.Data.MyPoint;
import Exercise_2_9.Data.MyTriangle;

public class MyTriangleApp {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 0, 4, 3, 0);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(0, 4), new MyPoint(3, 0));

        // Test toString() method
        System.out.println("Triangle 1: " + triangle1);
        System.out.println("Triangle 2: " + triangle2);

        // Test getPerimeter() method
        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());

        // Test getType() method
        System.out.println("Type of Triangle 1: " + triangle1.getType());
        System.out.println("Type of Triangle 2: " + triangle2.getType());
    }
}
