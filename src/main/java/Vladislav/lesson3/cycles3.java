package Vladislav.lesson3;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое
//положительное число. А программа суммирует все числа от 1 до
//введенного пользователем числа.
//Для ввода числа воспользуйтесь классом Scanner


public class cycles3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = s.nextInt();
        int c = 0;
        for (int a = 1;a <= i;a++){
            c=c+a;
        }
        System.out.println(c);
    }
}
