//3. Класс "Счетчик"
//Создайте класс Counter, который будет иметь поле для хранения текущего значения счетчика.
//Реализуйте методы для увеличения, уменьшения и сброса счетчика, а также метод toString(),
// который будет возвращать текущее значение счетчика.

package alexeystrunets.ht6.Counter;

public class Counter {
    private int count;


    public Counter(int initialCount) {
        this.count = initialCount;
    }

    public void increment() {
        this.count++;
    }

    public void decrement() {
        this.count--;
    }

    public void reset() {
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "Значение: " + this.count;
    }
}
