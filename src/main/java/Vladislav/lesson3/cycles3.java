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
        int inputInt = s.nextInt();
        int sum = 0;
        if (inputInt>0){
        for (int a = 1; a <= inputInt; a++){
            sum+=a;
        }
        System.out.println(sum);}
        else {
            System.out.println("error");}
    }
}
