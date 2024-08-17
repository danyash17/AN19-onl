/*Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
элементов массива.*/
package ivan_multidimArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Optional2 {
    public static void main(String[] args) {
        int rows, columns;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк:");
        rows = scanner.nextInt();
        System.out.println("Введите количество столбцов:");
        columns = scanner.nextInt();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.println("Введите [" + (i+1) + "][" + (j+1) + "]" + " элемент:");
                array[i][j] = scanner.nextInt();
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Сумма всех элементов - " + sum);
    }
}
