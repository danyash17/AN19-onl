package ivan_m;

import java.util.Scanner;

public class Cycles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Введите целое положительное число: ");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++)
        {
            sum += i;
        }
        System.out.println("Сумма : " + sum);
    }
}
