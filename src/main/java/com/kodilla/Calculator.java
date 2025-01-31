package src.main.java.com.kodilla;

public class Calculator {
    public double a;
    public double b;

    public double addition(double a, double b) {
        double result = a + b;
        System.out.println(result);
    }
    public double subtraction(double a, double b) {
        double result = a - b;
        System.out.println(result);
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.addition(1.5, 2.5);
        calculator.subtraction(1.5, 2.5);

    }
}
