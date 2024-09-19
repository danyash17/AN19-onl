package vadimavetisov.lesson14;

public class Timer {

    public static void main(String[] args) {

        Thread countdown = new Thread(() -> {

            for (int i = 10; i >= 0; i--) {
                System.out.println("Осталось: " + (i > 4 ? i + " секунд" : i > 1 ? i + " секунды" : i == 1 ? i + " секунда" : "Расчет окончен!"));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        countdown.start();
    }
}
