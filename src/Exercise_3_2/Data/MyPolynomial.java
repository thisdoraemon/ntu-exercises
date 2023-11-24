package Exercise_3_2.Data;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        return "cnx^n+cn-1x^(n-1)+...+c1x+c0";
    }

    public double evaluate(double x) {
        double result = 0.0;

        for (int i = getDegree(); i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] resultCoeefs = new double[maxDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            resultCoeefs[i] = this.coeffs[i];
        }

        for (int i = 0; i <= right.getDegree(); i++) {
            resultCoeefs[i] = right.coeffs[i];
        }

        return new MyPolynomial(resultCoeefs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int resultDegree = this.getDegree() + right.getDegree();
        double[] resultCoeffs = new double[resultDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }
}
