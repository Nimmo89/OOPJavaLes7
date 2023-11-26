public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.calculate("+", 2.5, 3.5);
        System.out.println("Addition: " + result);
        result = calculator.calculate("*", 2.5, 3.5);
        System.out.println("Multiplication: " + result);
        result = calculator.calculate("/", 2.5, 3.5);
        System.out.println("Division: " + result);
    }
}