package alexeystrunets.ht9;

public class MainDivision {
    public static void main(String[] args) {
        try {
            System.out.println("Результат 10 / 2 = " + Division.divide(10, 2));
            System.out.println("Результат 10 / 0 = " + Division.divide(10, 0));
            System.out.println("Результат 15 / 3 = " + Division.divide(15, 3));
            System.out.println("Результат 20 / 4 = " + Division.divide(20, 4));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Операция завершена.");
        }
    }
}