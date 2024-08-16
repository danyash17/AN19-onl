package NikitaVecherski.lesson5;

//0. Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли


import java.util.Arrays;
import java.util.Scanner;

public class MDArrays0 {
    public static void main(String[] args) {
        int strng = 3;
        int cllr = 3;
        int dpth = 2;

        // на случай, если захочу модифицировать код для возможности ввода произвольного размера трехмерного массива

        int[][][] matrix = new int[strng][cllr][dpth];
        System.out.println(Arrays.deepToString(matrix) + " - Массив до изменений");

        Scanner number = new Scanner(System.in);
        System.out.println("Введите число, на которое нужно увеличить значения в массиве");
        int num = number.nextInt();
        if (num < 0) {
            System.out.println("Нельзя увеличить отрицательным числом");
        } else {
            int[][][] matrixsum = matrix;
            for (int c=0; c < dpth; c++) {
                for (int b=0; b < cllr; b++) {
                    for (int a=0; a < strng; a++) {
                        matrixsum[a][b][c] = matrix[a][b][c] + num;
                    }

                }

            }
            System.out.println(Arrays.deepToString(matrixsum));


        }
    }
}

