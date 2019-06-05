package Creational.AbstractFactory;

public class HpPCFactory extends AbstractPCFactory {

    @Override
    public void createMouse() {
        new HpMouse();
    }

    @Override
    public void createKeyBoard() {
        new HpKeyBoard();
    }
}
