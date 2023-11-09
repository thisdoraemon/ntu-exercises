package Exercise_1.App;

import Exercise_1.Data.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(5.0, "blue");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and the color " + c3.getColor());

        Circle c4 = new Circle();   // construct an instance of Circle
        c4.setRadius(5.5);          // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("green");       // Change color
        System.out.println("color is: " + c4.getColor());   // Print color via getter

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());   // explicit call

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());  // explicit call
        System.out.println(c6);             // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too
    }
}
