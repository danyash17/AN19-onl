package slava_n.lesson4;


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        //Создайте массив целых чисел. Напишете программу, которая выводит
        //сообщение о том, входит ли заданное число в массив или нет.
        //Пусть число для поиска задается с консоли (класс Scanner)

//        int[] numbers = {2, 4, 6, 1, 7, 8, 10};
//        System.out.println("Введите число для проверки: ");
//        Scanner sc = new Scanner(System.in);
//        int f = sc.nextInt();
//        boolean state = false;
//        for (int number : numbers) {
//            if (f == number) {
//                state = true;
//            }
//        }
//        String result = (state ? "Ваше число входит в массив" : "Ваше число не входит в массив");
//        System.out.println(result);

        //Создайте массив целых чисел. Удалите все вхождения заданного
        //числа из массива.
        //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
        //выведите сообщения об этом.
        //В результате должен быть новый массив без указанного числа.

//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = {11, 11, 12, 54, 6, 21, 7};
//        System.out.println("Введите число для удаления: ");
//        int numToRemove = scanner.nextInt();
//
//        int count = 0;
//        for (int i : numbers) {
//            if (i == numToRemove) {
//                count++;
//            }
//        }
//        if (count == 0) {
//            System.out.println("Ваше число не найдено в массиве.");
//        } else {
//            int[] newNumbers = new int[numbers.length - count];
//            int index = 0;
//            for (int i : numbers) {
//                if (i != numToRemove) {
//                    newNumbers[index++] = i;
//                }
//            }
//            System.out.println(Arrays.toString(newNumbers));
//        }

        //Доп. Создайте массив и заполните массив.
        //Выведите массив на экран в строку.
        //Замените каждый элемент с нечётным индексом на ноль.
        //Снова выведете массив на экран на отдельной строке


        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.print("Исходный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                numbers[i] = 0;
            }
        }

        System.out.print("Измененный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
