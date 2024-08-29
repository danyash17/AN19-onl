package artem.homework.hw6.t4;

    /*
    Создайте класс Counter, который будет иметь поле для хранения текущего значения счетчика.
    Реализуйте методы для увеличения, уменьшения и сброса счетчика, а также метод toString(),
    который будет возвращать текущее значение счетчика.
    */

public class Task4 {
    public static void main(String[] args) {
        Counter counterExample = new Counter();

        counterExample.increaseCounter();
        System.out.println(counterExample);
        System.out.println("--------------");

        counterExample.increaseCounter();
        System.out.println(counterExample);
        System.out.println("--------------");

        counterExample.decreaseCounter();
        System.out.println(counterExample);
        System.out.println("--------------");
        counterExample.resetCounter();
        System.out.println(counterExample);
        System.out.println("--------------");
    }
}
