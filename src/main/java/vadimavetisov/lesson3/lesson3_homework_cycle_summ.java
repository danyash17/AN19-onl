package vadimavetisov.lesson3;

import java.util.Scanner;

public class lesson3_homework_cycle_summ {
    //3. Напишите программу, где пользователь вводит любое целое
    //положительное число. А программа суммирует все числа от 1 до
    //введенного пользователем числа.
    //Для ввода числа воспользуйтесь классом Scanner.

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num <= 0) {
            System.out.println("Incorrectly!");
            return;
        }

        int summ = 0;
        for (int i = 1; i <= num; i++) {
            summ = summ + i;
        }
        System.out.println(summ);
    }
}
