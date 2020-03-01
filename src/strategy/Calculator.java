package strategy;

public class Calculator {
    public static void main(String[] args) {
        String operation = "+";
        int x = 10;
        int y = 15;

        if ("+".equals(operation)) {
            Add add = new Add();
            add.calculate(x, y);
        } else if ("*".equals(operation)) {
            Multiply multiply = new Multiply();
            multiply.calculate(x, y);
        }

        CalculateContext calculateContext = new CalculateContext();

        if ("+".equals(operation)) {
            calculateContext.setCalculateStrategy(new Add());
        } else if ("*".equals(operation)) {
            calculateContext.setCalculateStrategy(new Multiply());
        }

        calculateContext.calculate(x, y);
    }
}
