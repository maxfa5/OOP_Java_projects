package OOP.Generics.Calculator;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class Calculator {
    private static final int SCALE = 10;
    private static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;

    public static void main(String[] args){
        testOperations(1, 2);
        testOperations(1.2, 2.2);
        testOperations(new BigDecimal("1.0943829484300000"), new BigDecimal("200000000"));
    }

    private static <T extends Number> void testOperations(T a, T b) {
        System.out.println("\nTesting with " + a.getClass().getSimpleName() + ":");
        System.out.printf("%s + %s = %s%n", a, b, sum(a, b));
        System.out.printf("%s - %s = %s%n", a, b, subtraction(a, b));
        System.out.printf("%s * %s = %s%n", a, b, multiply(a, b));
        System.out.printf("%s / %s = %s%n", a, b, divide(a, b));
    }

    @Override
    public String toString() {
        return "Calculator instance";
    }
    static <T1 extends Number, T2 extends Number> BigDecimal  sum(T1 a, T2 b)throws IllegalArgumentException{
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arguments cannot be null.");
        }
            BigDecimal num1 = new BigDecimal(a.doubleValue());
            BigDecimal num2 = new BigDecimal(b.doubleValue());
            return num1.add(num2).setScale(SCALE, RoundingMode.HALF_UP);
        }

    static <T1 extends Number, T2 extends Number> BigDecimal  multiply(T1 a, T2 b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arguments cannot be null.");
        }
        BigDecimal num1 = new BigDecimal(a.doubleValue());
        BigDecimal num2 = new BigDecimal(b.doubleValue());
        return num1.multiply(num2).setScale(SCALE, RoundingMode.HALF_UP);
    }
    static <T1 extends Number, T2 extends Number> BigDecimal  divide(T1 a, T2 b) throws ArithmeticException, ArithmeticException{
        if (a == null || b == null) {
            throw new ArithmeticException("Arguments cannot be null.");
        }
        BigDecimal num1 = new BigDecimal(a.doubleValue());
        BigDecimal num2 = new BigDecimal(b.doubleValue());
        if (num2.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return num1.divide(num2, SCALE, RoundingMode.HALF_UP);
    }

    static <T1 extends Number, T2 extends Number> BigDecimal  subtraction(T1 a, T2 b)throws IllegalArgumentException{
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arguments cannot be null.");
        }
        BigDecimal num1 = new BigDecimal(a.doubleValue());
        BigDecimal num2 = new BigDecimal(b.doubleValue());
        return num1.subtract(num2).setScale(SCALE, RoundingMode.HALF_UP);
    } 
}
