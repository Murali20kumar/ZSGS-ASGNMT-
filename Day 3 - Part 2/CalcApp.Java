class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }
}

class AdvancedCalculator extends BasicCalculator {
    public double power(int base, int exponent) {
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public double squareRoot(double number) {
        if (number < 0) {
            System.out.println("Error: Negative input!");
            return Double.NaN;
        }
        return Math.sqrt(number);
    }
}

class ScientificCalculator extends AdvancedCalculator {
    public double sin(double angles) {
        return Math.sin(Math.toRadians(angles));
    }

    public double cos(double angles) {
        return Math.cos(Math.toRadians(angles));
    }

    public double log(double value) {
        if (value <= 0) {
            System.out.println("Error:undefined for non-positive values!");
            return Double.NaN;
        }
        return Math.log(value);
    }

    public double exp(double value) {
        return Math.exp(value);
    }
}

public class CalcApp {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();

        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));

        System.out.println("Power: " + calc.power(2, 4));
        System.out.println("Modulus: " + calc.modulus(14, 5));
        System.out.println("Square Root: " + calc.squareRoot(49));

        System.out.println("Sin(30°): " + calc.sin(30));
        System.out.println("Cos(60°): " + calc.cos(60));
        System.out.println("Log(10): " + calc.log(10));
        System.out.println("Exp(2): " + calc.exp(2));
    }
}