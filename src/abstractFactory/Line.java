package abstractFactory;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Pole");
    }

    @Override
    public void calculateParimeter() {
        System.out.println("obwód");
    }
}