package Creational.Singleton;

class HungrySingleton {

    private static HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
