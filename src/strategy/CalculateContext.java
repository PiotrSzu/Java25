package strategy;

public class CalculateContext {

    private CalculateStrategy calculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public void calculate(int a, int b) {
        this.calculateStrategy.calculate(a, b);
    }
}
