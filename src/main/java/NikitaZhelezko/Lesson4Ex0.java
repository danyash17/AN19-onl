package NikitaZhelezko;

import java.util.Scanner;

//0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).
public class Lesson4Ex0 {
    public static void main(String[] args){
        int[] numbers = {1, 3, 5, 7, 9, 11, 55, 123, 6912};
        System.out.println("Пожалуйста, введите любое натуральное число");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        boolean exist = false;
        for (int number : numbers) {
        if (number == target) {
            exist = true;
            break;
        }
        }
        if (exist) {
            System.out.println("Число " + target + " входит в массив.");
        } else {
            System.out.println("Число " + target + " не входит в массив");
        }
    }
}
