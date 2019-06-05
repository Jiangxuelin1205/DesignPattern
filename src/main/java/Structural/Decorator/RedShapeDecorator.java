package Structural.Decorator;

public class RedShapeDecorator extends ShapeDecorator  {

    RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBoarder();
    }

    private void setRedBoarder(){
        System.out.println("Border Color: Red");
    }
}
