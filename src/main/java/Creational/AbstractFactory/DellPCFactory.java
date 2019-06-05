package Creational.AbstractFactory;

public class DellPCFactory extends AbstractPCFactory {

    @Override
    public void createMouse() {
        new DellMouse();
    }

    @Override
    public void createKeyBoard() {
        new DellKeyBoard();
    }
}
