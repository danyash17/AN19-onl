package NikitaVecherski.lesson4;

//0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner)

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
        boolean c = false;
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] != n) {
                continue;
            } else
                c = true;
            System.out.println("Данное число есть в массиве, ячейка номер - " + a);
            break;
        }
        if (c == false){
            System.out.println("Данного числа нет в массиве");



    }


}


}







