package Behavioral.ChainOfResponsibility;

class FileLogger extends AbstractLogger {

    FileLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println(" FileLogger::Logger: " + message);
    }
}
