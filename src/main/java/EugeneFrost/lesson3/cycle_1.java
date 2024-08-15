package EugeneFrost.lesson3;

//**task**
//При помощи цикла for вывести на экран нечетные числа от 1 до 99.
//При решении используйте операцию инкремента (++).

public class cycle_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
