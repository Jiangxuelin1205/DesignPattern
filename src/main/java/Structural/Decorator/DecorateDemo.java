package Structural.Decorator;

public class DecorateDemo {

    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape redCircle=new RedShapeDecorator(new Circle());
        Shape greenCircle=new GreenShapeDecorator(new Circle());

        circle.draw();
        redCircle.draw();
        greenCircle.draw();
    }
}
