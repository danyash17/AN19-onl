
package Vladislav.lesson5;

import java.util.Arrays;
import java.util.Scanner;

//0. Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли

public class Task0 {
    public static void main(String[] args) {
        int[][][] array = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                },
                {
                        {13, 14, 15},
                        {16, 17, 18}
                }
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        int inputInt = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += inputInt;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
