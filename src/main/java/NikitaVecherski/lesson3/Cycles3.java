package NikitaVecherski.lesson3;

import java.util.Scanner;

// 3. Напишите программу, где пользователь вводит любое целое
//положительное число. А программа суммирует все числа от 1 до
//введенного пользователем числа.
//Для ввода числа воспользуйтесь классом Scanner

public class Cycles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число");
        String cycles = scanner.nextLine();
        int cyc = Integer.parseInt(cycles);
        int res =0;
        for (int i=0; i<=cyc; i++ ){
        res = res+i;
       }
        System.out.println("Сумма ваших чисел = " + res);
    }
}
