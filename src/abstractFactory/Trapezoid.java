package abstractFactory;

public class Trapezoid implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Trapezoid Drawn.");
    }
    @Override
    public void calculateArea() {
        System.out.println("Pole trapezoida");
    }

    @Override
    public void calculateParimeter() {
        System.out.println("obwód trapezoida");
    }
}
