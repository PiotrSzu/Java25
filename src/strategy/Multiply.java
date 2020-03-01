package strategy;

public class Multiply implements CalculateStrategy {
    @Override
    public void calculate(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }
}
