package slava_n.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {

        //Создать трехмерный массив из целых чисел.
        //С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
        //заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
        //задается из консоли.

        Scanner scan = new Scanner(System.in);
        int enterNum = scan.nextInt();
        int[][][] matrix = {{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] += enterNum;
                }

            }

        }
        System.out.println(Arrays.deepToString(matrix));
    }
}