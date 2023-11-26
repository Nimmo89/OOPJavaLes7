public class DivideCommand implements Command {

    @Override
    public double execute(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new IllegalArgumentException("Division by zero not allowed");
        }
        return operand1 / operand2;
    }
}
