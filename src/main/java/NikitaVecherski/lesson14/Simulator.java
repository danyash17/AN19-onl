package NikitaVecherski.lesson14;

//2. Таймер с обратным отсчетом
//Описание: Создайте поток, который с помощью цикла каждую секунду уменьшает значение переменной с 10 до 0, и выводит его на экран.
// В конце итерации цикла заставьте поток "уснуть" на 1 секунду. Также, выведите "Расчет окончен" в конце метода main,
// это сообщение должно быть последним сообщением программы.

public class Simulator {
    public static void main(String[] args) {

        Thread thread =new Thread(() -> {
            for (int i = 10; i>-1; i--){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Расчет окончен");
    }

}
