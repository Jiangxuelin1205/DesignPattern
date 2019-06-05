package Creational.AbstractFactory;

public class DellKeyBoard implements KeyBoard {


    DellKeyBoard() {
        System.out.println("This is Dell Keyboard");
    }

    @Override
    public DellKeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
