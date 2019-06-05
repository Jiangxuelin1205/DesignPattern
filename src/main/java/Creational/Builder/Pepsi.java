package Creational.Builder;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Float price() {
        return 2.f;
    }
}
