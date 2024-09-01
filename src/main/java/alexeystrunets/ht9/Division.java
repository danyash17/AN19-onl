package alexeystrunets.ht9;

public class Division {

    public static double divide(double firstNum, double secNum) {
        if (secNum == 0) {
            throw new ArithmeticException("Ошибка: Деление на ноль.");
        }
        return firstNum / secNum;
    }
}