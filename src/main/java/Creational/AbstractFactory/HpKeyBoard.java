package Creational.AbstractFactory;

public class HpKeyBoard implements KeyBoard {

    HpKeyBoard(){
        System.out.println("This is hpKeyBoard");
    }

    @Override
    public KeyBoard createKeyBoard() {
       return new HpKeyBoard();
    }
}
