package Creational.Prototype;

import java.util.HashMap;

class ShapeCache {

    private static HashMap<String, Shape> shapeCache = new HashMap<>();

    static Shape getShape(String id) {
        return (Shape) shapeCache.get(id).clone();
    }

    static void loadCache() {
        Circle circle = new Circle();
        circle.id = "1";
        shapeCache.put(circle.id, circle);

        Square square = new Square();
        square.id = "2";
        shapeCache.put(square.id, square);

        Rectangle rectangle = new Rectangle();
        rectangle.id = "3";
        shapeCache.put(rectangle.id, rectangle);
    }
}
