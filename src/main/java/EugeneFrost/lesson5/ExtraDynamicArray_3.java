package EugeneFrost.lesson5;

//**task**
//Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
//элементов массива.

import java.util.Arrays;

public class ExtraDynamicArray_3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 15);
            }
        }

        System.out.println("Исходный массив: " + Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.print("Сумма всех элементов массива: " + sum);
    }
}
