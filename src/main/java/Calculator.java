import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    private final Map<String, Command> commands;
    public Calculator() {
        commands = new HashMap<>();
        commands.put("+", new AddCommand());
        commands.put("*", new MultiplyCommand());
        commands.put("/", new DivideCommand());
    }
    public double calculate(String operator, double operand1, double operand2) {
        Command command = commands.get(operator);
        if (command == null) {
            throw new IllegalArgumentException("Unknown operator: " + operator);
        }
        logger.info("Calculating {} {} {}", operand1, operator, operand2);
        double result = command.execute(operand1, operand2);
        logger.info("Result: {}", result);

        return result;
    }
}
