import java.util.logging.Logger;

public class MyAppLogger {

    private static final Logger logger = Logger.getLogger(MyAppLogger.class.getName());

    public void runApp(int input) {
        logger.info("Application started with input: " + input);

        if (input < 0) {
            logger.warning("Warning: Received a negative input.");
        }

        try {
            int result = riskyDivision(10, input);
            logger.info("Result is: " + result);
        } catch (ArithmeticException e) {
            logger.severe("Error: Division by zero occurred!");
        }
    }

    private int riskyDivision(int a, int b) {
        return a / b; // Will throw ArithmeticException for b = 0
    }

    public static void main(String[] args) {
        MyAppLogger app = new MyAppLogger();
        app.runApp(0);  // Try 0, -1, 5 as inputs
    }
}
