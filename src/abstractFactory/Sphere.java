package abstractFactory;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }

    @Override
    public void calculateArea() {
        System.out.println("pole kuli ");
    }

    @Override
    public void calculateParimeter() {
        System.out.println("obwód kuli");
    }
}