package Creational.Builder;

public abstract class ColdDrink  implements Item{

    @Override
    public Packing packing(){
        return new Bottle();
    }
}
