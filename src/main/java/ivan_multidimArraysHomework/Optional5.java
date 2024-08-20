/*Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
двумерного массива по возрастанию.*/
package ivan_multidimArraysHomework;

import java.util.Scanner;

public class Optional5 {
    public static void main(String[] args) {
        int rows, columns;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк:");
        rows = scanner.nextInt();
        System.out.println("Введите количество столбцов:");
        columns = scanner.nextInt();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Введите [" + (i + 1) + "][" + (j + 1) + "]" + " элемент:");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Начальный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        for (int k = 0; k < rows; k++) {
            int i, j, temp;
            for (i = 1; i < columns; i++) {
                temp = array[k][i]; // закидываем в temp следующий по очереди элемент, начиная со 2го

                // ???
                for (j = i - 1; j >= 0 && temp < array[k][j]; j--) {
                    array[k][j + 1] = array[k][j];
                }

                array[k][j + 1] = temp;
            }
        }

        System.out.println("Отсортированный по возрастанию массив (в пределах строк):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
