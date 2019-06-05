package Behavioral.ChainOfResponsibility;

class ErrorLogger extends AbstractLogger {

    ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Standard Error::Logger: " + message);
    }
}
