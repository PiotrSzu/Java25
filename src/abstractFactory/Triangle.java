package abstractFactory;

public class Triangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Triangle Drawn.");
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
