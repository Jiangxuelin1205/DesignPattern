package Creational.Builder;

public class VegBurger extends Burger{

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public Float price() {
        return 3.4f;
    }
}
