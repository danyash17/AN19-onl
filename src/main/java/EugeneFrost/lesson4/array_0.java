package EugeneFrost.lesson4;

import java.util.Scanner;

//**task**
//Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).

public class array_0 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7, 9, 10};
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.print("Данное число есть в массиве");
            } else {
                System.out.print("Данного числа нет в массиве");
                break;
            }
        }


    }
}