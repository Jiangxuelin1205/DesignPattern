package Structural.FlyWeight;

import java.util.HashMap;

class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);

        }
        return circle;
    }
}
