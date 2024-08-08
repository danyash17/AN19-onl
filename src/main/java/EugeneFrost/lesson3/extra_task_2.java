package EugeneFrost.lesson3;

import java.util.Scanner;

public class extra_task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float sum = sc.nextFloat();

        System.out.print("Введите количество месяцев: ");
        int month = sc.nextInt();

        for (int i = 1; i <= month; i++) {
            sum = (float) (sum * 1.07);
        }
        System.out.print("Конечная сумма вклада: "+sum);
    }
}
