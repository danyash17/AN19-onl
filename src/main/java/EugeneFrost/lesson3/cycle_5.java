package EugeneFrost.lesson3;

//**task**
//Вывести 10 первых чисел последовательности 0, -5,-10,-15..

public class cycle_5 {
    public static void main(String[] args) {
        int i=0;
        int count = 0;
        while (i > -100) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                count++;
            }
            i-=5;
            if (count == 10) {
                break;
            }
        }
    }
}
