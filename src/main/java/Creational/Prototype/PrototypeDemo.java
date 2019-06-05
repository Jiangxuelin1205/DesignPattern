package Creational.Prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Circle circle = (Circle) ShapeCache.getShape("1");
        Square square = (Square) ShapeCache.getShape("2");
        Rectangle rectangle = (Rectangle) ShapeCache.getShape("3");


    }
}
