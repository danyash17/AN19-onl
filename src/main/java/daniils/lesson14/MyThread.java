package daniils.lesson14;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            System.out.println("Резервное копирование");
        }
    }
}