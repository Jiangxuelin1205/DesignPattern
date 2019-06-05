package Creational.AbstractFactory;

public class DellMouse implements Mouse {

    DellMouse(){
        System.out.println("This is Dell Mouse");
    }

    @Override
    public DellMouse createMouse() {
        return new DellMouse();
    }
}
