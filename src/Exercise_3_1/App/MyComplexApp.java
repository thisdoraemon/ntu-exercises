package Exercise_3_1.App;

import Exercise_3_1.Data.MyComplex;

public class MyComplexApp {
    public static void main(String[] args) {
        // Test constructors
        MyComplex complex1 = new MyComplex();
        MyComplex complex2 = new MyComplex(3.0, 4.0);

        // Test setters and getters
        complex1.setReal(1.0);
        complex1.setImag(2.0);

        // Test toString method
        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        // Test isReal and isImaginary methods
        System.out.println("Is Complex 1 real? " + complex1.isReal());
        System.out.println("Is Complex 2 imaginary? " + complex2.isImaginary());

        // Test equals methods
        System.out.println("Are Complex 1 and Complex 2 equal? " + complex1.equals(complex2));
        System.out.println("Are Complex 1 and (1.0 + 2.0i) equal? " + complex1.equals(1.0, 2.0));

        // Test magnitude method
        System.out.println("Magnitude of Complex 1: " + complex1.magnitude());
        System.out.println("Magnitude of Complex 2: " + complex2.magnitude());

        // Test addInto method
        complex1.addInto(complex2);
        System.out.println("After adding Complex 2 into Complex 1: " + complex1);

        // Test addNew method
        MyComplex resultComplex = complex1.addNew(complex2);
        System.out.println("Result of adding Complex 1 and Complex 2 (new instance): " + resultComplex);
    }
}
