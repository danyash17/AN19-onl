package NikitaVecherski.lesson3;

//2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//Напишите программу, в которую пользователь вводит сумму вклада и
//количество месяцев. А банк вычисляет конечную сумму вклада с учетом
//начисления процентов за каждый месяц.
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть
//сумма вклада будет представлять тип float.

import java.util.Scanner;

public class Optional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        String moneyIn = scanner.nextLine();
        float mIn = Integer.parseInt(moneyIn);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите кол-во месяцев вклада");
        String months = scanner1.nextLine();
        int m = Integer.parseInt(months);
        for (int i = 0; i<m; i++){
        mIn = mIn * 1.07f;
        }
        System.out.println("Ваша прибыль на выходе составила "+ mIn);

    }
}
