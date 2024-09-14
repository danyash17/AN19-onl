package artem.homework.hw14;

//Описание: Создайте поток, который с помощью цикла каждую
//секунду уменьшает значение переменной с 10 до 0, и выводит
//его на экран. В конце итерации цикла заставьте поток "уснуть"
//на 1 секунду. Также, выведите "Расчет окончен" в конце метода main,
//это сообщение должно быть последним сообщением программы.

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Thread counterThread = new Thread(() -> {
            int count = 10;
            while (count >= 0) {
                System.out.println("Count: " + count);
                count--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        counterThread.start();
        counterThread.join();
        System.out.println("Расчет окончен");
    }
}
