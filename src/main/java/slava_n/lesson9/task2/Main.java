package slava_n.lesson9.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите делимое число");
        int delimoe = scanner.nextInt();

        System.out.println("Введите делитель");
        int delitel = scanner.nextInt();

        try {
            System.out.println(Divide.divide(delimoe, delitel));
        } catch (ArithmeticException e) {
            System.out.println("Попробуйте еще раз");
            delitel = scanner.nextInt();
            System.out.println(Divide.divide(delimoe, delitel));
        } finally {
            System.out.println("Операция завершена");
        }
    }
}




