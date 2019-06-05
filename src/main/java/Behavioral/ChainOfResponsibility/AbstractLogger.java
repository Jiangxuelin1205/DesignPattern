package Behavioral.ChainOfResponsibility;

 abstract class AbstractLogger {
    static int INFO = 1;
    static int DEBUG = 2;
    static int ERROR = 3;

    int level;

    private AbstractLogger nextLogger;

    void setNextLogger(AbstractLogger logger) {
        this.nextLogger = logger;
    }

    void logMessage(int level, String message) {
        if (this.level < level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
