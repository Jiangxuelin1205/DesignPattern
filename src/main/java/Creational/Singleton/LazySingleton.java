package Creational.Singleton;

class LazySingleton {

    private static volatile LazySingleton INSTANCE = null;

    private LazySingleton() {
    }

    static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
