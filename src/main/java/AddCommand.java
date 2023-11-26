public class AddCommand implements Command{
    @Override
    public double execute(double operand1, double operand2) {
        return operand1 + operand2;
    }
}
