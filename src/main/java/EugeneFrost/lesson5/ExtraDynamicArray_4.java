package EugeneFrost.lesson5;

//**task**
//Создайте двумерный массив. Выведите на консоль диагонали массива.

import java.util.Arrays;

public class ExtraDynamicArray_4 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int[][] diagonalsMatrix = new int[5][5];
        System.out.println("Исходный массив: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Диагонали массива: ");
        int count = 4;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || (i + j) % count == 0) {
                    diagonalsMatrix[i][j] = matrix[i][j];
                    System.out.print(diagonalsMatrix[i][j]);
                } else {
                    diagonalsMatrix[i][j] = 0;
                    System.out.print(diagonalsMatrix[i][j]);
                    ;
                }
            }
            System.out.println();
        }
    }
}
