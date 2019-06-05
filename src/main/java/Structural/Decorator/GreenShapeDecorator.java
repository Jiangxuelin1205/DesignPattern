package Structural.Decorator;

public class GreenShapeDecorator extends ShapeDecorator {

    GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setGreenBoarder();
    }

    private void setGreenBoarder() {
        System.out.println("Border Color: Green");
    }
}
