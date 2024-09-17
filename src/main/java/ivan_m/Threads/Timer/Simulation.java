package ivan_m.Threads.Timer;

public class Simulation {
    public static void main(String[] args) throws InterruptedException {
        Thread timer = new Thread(() -> {
            for (int i = 10; i > -1; i--){
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        timer.start();
        timer.join(); //подчёркивался красным до того, как я добавил throws в 4 строку
        System.out.println("Расчёт окончен");
    }
}
