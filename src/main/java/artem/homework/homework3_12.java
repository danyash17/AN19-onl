package artem.homework;

    /*Выведите на экран первые 11 членов последовательности Фибоначчи.*/

public class homework3_12 {
    public static void main(String[] args) {
        int n = 11;
        int previousFiboNum = -1;
        int nextFiboNum = 1;
        for (int i = 1; i <= n ; i++) {
            int next = previousFiboNum + nextFiboNum;
            previousFiboNum = nextFiboNum;
            nextFiboNum = next;
            System.out.println(nextFiboNum);
        }
    }
}
