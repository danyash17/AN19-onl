package Vladislav.lesson9.Task2;

//Напишите метод, который делит два числа.

public class DivisionOperation {
    public static double divide(int divident, int divider)
            throws ArithmeticException {
        if (divider == 0) {
            throw new ArithmeticException("Введён ноль");
        }
        return (double) divident / divider;
    }
}
