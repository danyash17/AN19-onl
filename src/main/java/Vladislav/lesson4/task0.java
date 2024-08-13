package Vladislav.lesson4;

import java.util.Scanner;

//0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner)

public class task0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи число:");
        int inputInt = s.nextInt();
        int a = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (inputInt == array[i]) {
                a++;
            }
        }
        if (a != 0) {
            System.out.println("Входит");
        }
        else {
            System.out.println("Не входит");
        }
    }
}
