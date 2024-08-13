package EugeneFrost.lesson3;

import java.util.Scanner;

//**task**
//Напишите программу, где пользователь вводит любое целое
//положительное число. А программа суммирует все числа от 1 до
//введенного пользователем числа.
//Для ввода числа воспользуйтесь классом Scanner.

public class cycle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введиет число: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i=1;i<=num;i++) {
            sum +=i;
        }

        System.out.println(sum);
    }
}
