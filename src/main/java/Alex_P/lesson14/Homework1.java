package Alex_P.lesson14;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        CountdownThread myThread = new CountdownThread();
        myThread.start();
        myThread.join();
        System.out.println("Расчет окончен");
    }
}
