package slava_n.lesson6;

public class Counter {

    //Создайте класс Counter, который будет иметь поле для хранения текущего значения счетчика.
    // Реализуйте методы для увеличения, уменьшения и сброса счетчика, а также метод toString(),
    // который будет возвращать текущее значение счетчика.

    int currentCount;

    Counter(int currentCount){
        this.currentCount = currentCount;
    }

    void increase(int number) {
        currentCount += number;
    }

    void decrease(int number) {
        currentCount -= number;
    }

    void resetCount() {
        currentCount = 0;
    }

    void getCountInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "count = " + currentCount;
    }
}
