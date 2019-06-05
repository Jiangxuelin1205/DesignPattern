package Creational.Builder;

public class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public Float price() {
        return 5.f;
    }
}
