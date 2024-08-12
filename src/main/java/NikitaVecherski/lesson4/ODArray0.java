package NikitaVecherski.lesson4;

//0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner)

import java.util.Arrays;
import java.util.Scanner;

public class ODArray0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int n = scanner.nextInt();
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int search = Arrays.binarySearch(numbers, n);

        if (search / 1 >= 0) {
            System.out.println("Данное число находится в массиве, ячейка номер " +search);
        }
        else System.out.println("Данного числа нет в массиве");
    }
}
