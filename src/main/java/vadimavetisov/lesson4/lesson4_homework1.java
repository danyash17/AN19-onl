package vadimavetisov.lesson4;

import java.util.Scanner;

public class lesson4_homework1 {
    //0. Создайте массив целых чисел. Напишете программу, которая выводит
    //сообщение о том, входит ли заданное число в массив или нет.
    //Пусть число для поиска задается с консоли (класс Scanner).
    public static void main(String[] args) {

        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int[] mass = {1, 16, 36, 112, 168, 196, 71, 53};

        boolean flag = false;

        for (int i = 0; i < mass.length; i++) {
            if (num == mass[i]) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Yes, ok.");
        }
        else {
            System.out.println("No, wrong!");
        }
    }
}
