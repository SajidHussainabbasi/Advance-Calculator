public class AdvancedCalculator
{
    public static int add(int a, int b) { return a + b; }
    public static double add(double a, double b) { return a + b; }

    public static int subtract(int a, int b) { return a - b; }
    public static double subtract(double a, double b) { return a - b; }

    public static int multiply(int a, int b) { return a * b; }
    public static double multiply(double a, double b) { return a * b; }

    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return a / b;
    }
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return a / b;
    }

    public static int modulus(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return a % b;
    }
    public static double modulus(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return a % b;
    }
}