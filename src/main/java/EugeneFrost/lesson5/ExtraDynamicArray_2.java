package EugeneFrost.lesson5;

//**task**
//Умножение двух матриц
//Создайте два массива целых чисел размером 3х3 (две матрицы).
//Напишите программу для умножения двух матриц.
//Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//Ожидаемый результат: 1 2 3 1 1 1 0 0 0

import java.util.Arrays;

public class ExtraDynamicArray_2 {
    public static void main(String[] args) {
        int[][] firstArray = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] secondArray = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] multiplicationArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    multiplicationArray[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }
        System.out.print(Arrays.deepToString(multiplicationArray));

    }
}
