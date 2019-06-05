package Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItem() {
        for (Item item : items) {
            System.out.println("name " + item.name() + ", packing " + item.packing().pack() + ",price " + item.price());
        }
    }

}
