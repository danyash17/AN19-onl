package daniils.lesson8.logger;

public class ConsoleLogger implements Loggable {
    @Override
    public void log() {
        System.out.println("something");
    }
}
