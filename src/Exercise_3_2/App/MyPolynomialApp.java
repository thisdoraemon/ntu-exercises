package Exercise_3_2.App;

import Exercise_3_2.Data.MyPolynomial;

public class MyPolynomialApp {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        // Can also invoke with an array
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};  // Corrected array initialization
        MyPolynomial p3 = new MyPolynomial(coeffs);
    }
}
