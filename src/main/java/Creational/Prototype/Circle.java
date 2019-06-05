package Creational.Prototype;

class Circle extends Shape {

    Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle::draw() method");
    }
}
