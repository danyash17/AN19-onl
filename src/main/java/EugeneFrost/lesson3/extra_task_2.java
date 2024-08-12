package EugeneFrost.lesson3;

import java.util.Scanner;

//**task**
//За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//Напишите программу, в которую пользователь вводит сумму вклада и
//количество месяцев. А банк вычисляет конечную сумму вклада с учетом
//начисления процентов за каждый месяц.
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть
//сумма вклада будет представлять тип float

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
