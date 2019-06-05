package Creational.Prototype;

class Rectangle extends Shape {

    Rectangle() {
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle::draw() method");
    }
}
