package Creational.AbstractFactory;

public class HpMouse implements Mouse {

    HpMouse(){
        System.out.println("This is HpMouse");
    }

    @Override
    public HpMouse createMouse() {
        return new HpMouse();
    }
}
