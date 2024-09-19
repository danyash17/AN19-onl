package alexeystrunets.ht14;

public class CountdownNumbers {
    public static void main(String[] args) {

        Thread countdownNumbersThread = new Thread(() -> {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Поток прерван");
                }
            }
        });

        countdownNumbersThread.start();

        try {
            countdownNumbersThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Главный поток прерван");
        }
        System.out.println("Расчет окончен");
    }
}
