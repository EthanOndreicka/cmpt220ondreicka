// Ethan Ondreicka // Prof. Arias // May 5th //
public class Complex extends Number implements Comparable<Complex>, Cloneable {
    double x, y;

    Complex(double a, double b) {
        x = a;
        y = b;
    }

    Complex(double a) {
        x = a;
        y = 0;
    }

    Complex() {
        x = 0;
        y = 0;
    }

    double getRealPart() {
        return x;
    }

    double getImaginaryPart() {
        return y;
    }

    // a + bi + c + di = (a + c) + (b + d)i
    Complex add(Complex Q) {
        Complex addResult = new Complex(x + Q.x, y + Q.y);
        return addResult;
    }

    // a + bi - (c + di) = (a - c) + (b - d)i
    Complex subtract(Complex Q) {
        Complex subResult = new Complex(x - Q.x, y - Q.y);
        return subResult;
    }

    // (a + bi)*(c + di) = (ac - bd) + (bc + ad)i
    Complex multiply(Complex Q) {
        Complex mulResult = new Complex(x * Q.x - y * Q.y, y * Q.x + x * Q.y);
        return mulResult;
    }

    // (a + bi)/(c + di) = (ac + bd)/(c^2 + d^2) + (bc - ad)i/(c^2 + d^2)
    Complex divide(Complex Q) {
        Complex divResult = new Complex((x * Q.x + y * Q.y) / (Q.x * Q.x + Q.y * Q.y),
                (y * Q.x - x * Q.y) / (Q.x * Q.x + Q.y * Q.y));
        return divResult;
    }

    // | a + bi | = sqrt a^2 + b^2
    double abs() {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        if (y == 0)
            return "" + x;
        else
            return "(" + x + " + " + y + "i)";
    }

    @Override
    public int compareTo(Complex o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int intValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
        return 0;
    }
}
