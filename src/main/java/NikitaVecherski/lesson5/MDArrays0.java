package NikitaVecherski.lesson5;

//0. Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли

// Я несколько усложнил задачу, для отработки навыков из прошлых тем, добавив ввод размера массива и рандомное заполнение


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MDArrays0 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк трехмерного массива");

        Scanner scanner = new Scanner(System.in);
        int strng = scanner.nextInt();
        if (strng <= 0) {
            System.out.println("Кол-во строк не может быть менее 1");
        } else {

            System.out.println("Введите количество колонок массива");
            int cllr = scanner.nextInt();
            if (cllr <= 0) {
                System.out.println("Количество колонок массива не может быть менее 1");
            } else {

                System.out.println("Введите вложенность массива");
                int dpth = scanner.nextInt();
                if (dpth <= 1) {
                    System.out.println("Вложенность трехмерного массива не может быть менее 2");
                } else {

                    int[][][] matrix = new int[strng][cllr][dpth];
                    Random random = new Random();

                    for (int c = 0; c < dpth; c++) {
                        for (int b = 0; b < cllr; b++) {
                            for (int a = 0; a < strng; a++) {
                                matrix[a][b][c] = matrix[a][b][c] + random.nextInt(100);
                            }

                        }

                    }

                    System.out.println(Arrays.deepToString(matrix) + " - Массив до изменений");


                    System.out.println("Введите число, на которое нужно увеличить значения в массиве");
                    int num = scanner.nextInt();
                    if (num < 0) {
                        System.out.println("Нельзя увеличить отрицательным числом");
                    } else {
                        int[][][] sum = matrix;
                        for (int c = 0; c < dpth; c++) {
                            for (int b = 0; b < cllr; b++) {
                                for (int a = 0; a < strng; a++) {
                                    sum[a][b][c] = matrix[a][b][c] + num;
                                }

                            }

                        }
                        System.out.println("Массив после прибавления: \n" + Arrays.deepToString(sum));


                    }
                }
            }
        }
    }
}