package Creational.Builder;

public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.PrepareNonVegMeal();
        vegMeal.showItem();

        System.out.println();
        Meal nonVegMeal = mealBuilder.PrepareNonVegMeal();
        nonVegMeal.showItem();

    }
}
