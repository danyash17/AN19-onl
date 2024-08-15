package slava_n.lesson3;

public class Conditionals3 {
    public static void main(String[] args) {

        //За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        //Напишите программу, в которую пользователь вводит сумму вклада и
        //количество месяцев. А банк вычисляет конечную сумму вклада с учетом
        //начисления процентов за каждый месяц.
        //Для вычисления суммы с учетом процентов используйте цикл for. Пусть
        //сумма вклада будет представлять тип float

        float sum = 10000;
        int month = 15;
        float percent = 0.07F;

        for (int i = 0; i < month; i++) {
            sum = sum + (sum * percent);
        }
        System.out.println(sum);
    }
}

