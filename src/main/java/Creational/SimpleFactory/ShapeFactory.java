package Creational.SimpleFactory;

class ShapeFactory {

    Shape getShape(String shape){
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
