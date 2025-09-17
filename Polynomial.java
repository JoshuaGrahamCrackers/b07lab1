public class Polynomial {
    double[] coefficients;

    public Polynomial() {
        this.coefficients = new double[] { 0 };
    }

    public Polynomial(double[] array) {
        this.coefficients = array;
    }

    public Polynomial add(Polynomial p1) {
        double[] r = new double[Math.max(this.coefficients.length, p1.coefficients.length)];
        for (int i = 0; i < this.coefficients.length; i++) {
            r[i] = this.coefficients[i];
        }

        for (int i = 0; i < p1.coefficients.length; i++) {
            r[i] += p1.coefficients[i];
        }
        return new Polynomial(r);
    }

    public double evaluate(double num) {
        double sum = 0;
        for (int i = 0; i < coefficients.length; i++) {
            sum += coefficients[i] * Math.pow(num, i);
        }
        return sum;
    }

    public boolean hasRoot(double num) {
        if (evaluate(num) == 0) {
            return true;
        } else {
            return false;
        }
    }
}