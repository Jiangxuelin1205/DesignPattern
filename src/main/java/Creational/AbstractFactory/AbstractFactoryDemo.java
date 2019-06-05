package Creational.AbstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractPCFactory hpFactory = new HpPCFactory();
        hpFactory.createMouse();
        hpFactory.createKeyBoard();

        AbstractPCFactory dellFactory = new DellPCFactory();
        dellFactory.createMouse();
        dellFactory.createKeyBoard();
    }
}
