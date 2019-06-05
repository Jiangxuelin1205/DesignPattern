package Creational.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        HungrySingleton hungurySingletoninstance = HungrySingleton.getInstance();
        LazySingleton lazySingletonInstance = LazySingleton.getInstance();

    }
}
