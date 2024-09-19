package slava_n.lesson14;

public class CountDown {

    public static void main(String[] args) {
        Thread countDown = new Thread(() -> {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        countDown.start();
        try {
            countDown.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Расчёт окончен");
    }

}
