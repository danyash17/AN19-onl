package artem.homework.hw6.t4;

    /*
    Создайте класс Counter, который будет иметь поле для хранения текущего значения счетчика.
    Реализуйте методы для увеличения, уменьшения и сброса счетчика, а также метод toString(),
    который будет возвращать текущее значение счетчика.
    */


public class Counter {
    private int counterValue;

    public Counter() {
        this.counterValue = 0;
    }

    public Counter(int counterValue) {
        this.counterValue = counterValue;
    }

    public void increaseCounter() {
        this.counterValue++;

    }

    public void decreaseCounter() {
        this.counterValue--;
    }

    public void resetCounter() {
        this.counterValue = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(this.counterValue);
    }
}
