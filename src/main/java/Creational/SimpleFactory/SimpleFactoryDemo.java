package Creational.SimpleFactory;

public class SimpleFactoryDemo {

    public static void main(String[] args) {
        ShapeFactory s = new ShapeFactory();
        Shape Shape = s.getShape("CIRCLE");
        Shape shape2 = s.getShape("SQUARE");
        Shape shape3 = s.getShape("RECTANGLE");

        Shape.draw();
        shape2.draw();
        shape3.draw();
    }
}
