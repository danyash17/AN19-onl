package Vladislav.lesson9.Task2;

import java.util.Scanner;

//В блоке finally выводите сообщение о завершении операции.
//Используйте конструкцию try-catch-finally, чтобы обработать возможные ошибки
//В методе main протестируйте метод с различными значениями.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Введите делимое:");
            int divident = scanner.nextInt();

            System.out.println("Введите делитель:");
            int divider = scanner.nextInt();

            double result = DivisionOperation.divide(divident, divider);
            System.out.println(result);

        } catch (ArithmeticException exception) {
            System.out.println("ошибка: " + exception.getMessage());
        } finally {
            System.out.println("операция завершена");
        }
    }
}
