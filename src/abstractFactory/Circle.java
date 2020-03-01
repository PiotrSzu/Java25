package abstractFactory;

/**
 * Concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Pole koła Pir2");
    }

    @Override
    public void calculateParimeter() {
        System.out.println("Obwód koła 2Pir");
    }
}