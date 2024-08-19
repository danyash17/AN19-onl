//Создайте двумерный массив. Выведите на консоль диагонали массива.
package ivan_multidimArraysHomework;

import java.util.Scanner;

public class Optional4 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер матрицы:");
        size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.println("Введите [" + (i+1) + "][" + (j+1) + "]" + " элемент:");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Матрица:");
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Главная диагональ : ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        System.out.print("Побочная диагональ : ");
        for (int i = 0, j = size - 1; i < size; i++, j--)
        {
            System.out.print(array[i][j] + " ");
        }
    }
}
