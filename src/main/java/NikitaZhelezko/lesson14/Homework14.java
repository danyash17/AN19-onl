package NikitaZhelezko.lesson14;

//Описание:
// Создайте поток, который с помощью цикла каждую секунду уменьшает значение
// переменной с 10 до 0, и выводит его на экран. В конце итерации цикла заставьте поток "уснуть"
// на 1 секунду. Также, выведите "Расчет окончен" в конце метода main, это сообщение должно быть
// последним сообщением программы.
public class Homework14 {
    public static void main(String[] args) {
        Thread countdownThread = new Thread(() -> {
            for (int i = 10; i >= 0; i--) {
                System.out.println("Значение: " + i);
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        countdownThread.start();
        try {
            countdownThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Расчет окончен");
    }
}

