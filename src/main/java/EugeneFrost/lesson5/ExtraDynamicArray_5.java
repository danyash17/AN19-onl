package EugeneFrost.lesson5;

//**task**
//Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
//двумерного массива по возрастанию.

import java.util.Arrays;

public class ExtraDynamicArray_5 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }

        System.out.println("Исходный массив: "+ Arrays.deepToString(matrix));

//        for (int i = 0; i < 5; i++) {
//            Arrays.sort(matrix[i]);
//        }

        for (int i = 0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                int count = matrix[i][j];
                int k = j -1;

                while(k >=0&& matrix[i][k]> count) {
                    matrix[i][k + 1]=matrix[i][k];
                    k=k- 1;
                }

                matrix[i][k + 1] = count;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
