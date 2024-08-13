package artem.homework;

    /*Создайте массив целых чисел. Напишете программу, которая выводит
    сообщение о том, входит ли заданное число в массив или нет.
    Пусть число для поиска задается с консоли (класс Scanner).*/

import java.util.Scanner;

public class homework4_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter number: ");
        int num = console.nextInt();

        boolean isNumberExist = false;

        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                isNumberExist = true;
                break;
            }
        }
        if (isNumberExist) {
            System.out.println("Number " + num + " exists");
        } else {
            System.out.println("Number " + num + " does not exist");
        }
    }
}
