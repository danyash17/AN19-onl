package artem.homework.hw3;

    /*Напишите программу, где пользователь вводит любое целое
    положительное число. А программа суммирует все числа от 1 до
    введенного пользователем числа.
    Для ввода числа воспользуйтесь классом Scanner.*/

import java.util.Scanner;

public class homework3_8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter number: ");
        int num = console.nextInt();

        int result = 0;
        for (int i = 1; i <= num ; i++) {
            result += i;

        }
        System.out.println("Sum of integers from 1 to " + num + " is " + result);
    }
}
