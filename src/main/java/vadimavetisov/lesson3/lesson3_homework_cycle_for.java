package vadimavetisov.lesson3;

public class lesson3_homework_cycle_for {
    //1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    //При решении используйте операцию инкремента (++).

    public static void main(String[] args) {

        for(int i = 0, d = 1; d <= 100; i++, d+=2) {
            System.out.println(d);
        }
    }

}
