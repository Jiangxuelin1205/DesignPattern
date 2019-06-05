package Behavioral.ChainOfResponsibility;

public class ChainOfResponsibilityDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR, "This is error level message");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug level message");
        loggerChain.logMessage(AbstractLogger.INFO, "This is info level message");
    }
}
