//3. Класс "Счетчик"
//Создайте класс Counter, который будет иметь поле для хранения текущего значения счетчика.
//Реализуйте методы для увеличения, уменьшения и сброса счетчика, а также метод toString(),
// который будет возвращать текущее значение счетчика.

package alexeystrunets.ht6.Counter;

public class CounetMain {
    public static void main(String[] args) {
        Counter counter = new Counter(5);

        System.out.println(counter);

        counter.increment();
        System.out.println("Увеличение счетчика: "+counter);

        counter.decrement();
        System.out.println("Уменьшение счетчика: "+counter);

        counter.reset();
        System.out.println("Обновление: "+counter);
    }
}
