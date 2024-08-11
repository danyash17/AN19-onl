package artem.homework;

    /*Выведите на экран первые 11 членов последовательности Фибоначчи.*/

public class homework3_12 {
    public static void main(String[] args) {
        int n = 11;
        int a = -1;
        int b = 1;
        for (int i = 1; i <= n ; i++) {
            int next = a + b;
            a = b;
            b = next;
            System.out.println(b);
        }
    }
}
