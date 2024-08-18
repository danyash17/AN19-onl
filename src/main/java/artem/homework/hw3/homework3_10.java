package artem.homework.hw3;

    /*Вывести 10 первых чисел последовательности 0, -5,-10,-15..*/

public class homework3_10 {
    public static void main(String[] args) {
        int j = 5;

        for (int i = 0; i < 10; i++) {
            j += -5;
            System.out.println(j);
        }
    }
}
