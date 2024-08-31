package slava_n.lesson9.task2;

public class Divide {

    public static double divide(int delimoe, int delitel) {
        if (delitel == 0) {
            throw new ArithmeticException("На 0 делить нельзя");
        } else {
            return delimoe / delitel;
        }
    }
}


