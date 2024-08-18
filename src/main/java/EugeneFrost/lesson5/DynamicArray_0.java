package EugeneFrost.lesson5;

//**task**
//Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли.

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[3][3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Исходный массив: " + Arrays.deepToString(arr));

        System.out.print("Введите чило: ");
        int n = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] += n;
                }
            }
        }
        System.out.print("Массив после прибавления: " + Arrays.deepToString(arr));
    }
}
