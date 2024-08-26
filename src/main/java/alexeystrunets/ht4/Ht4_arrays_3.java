package alexeystrunets.ht4;

import java.util.Arrays;

public class Ht4_arrays_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 6, 3, 2, 2};
        int[] arr2 = {1, 6, 3, 2, 2};
        int sum1 = 0;
        int sum2 = 0;
        double arif1;
        double arif2;

        System.out.println("Первый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }

        arif1 = (double) sum1 / arr1.length;
        arif2 = (double) sum2 / arr2.length;

        if (arif1 > arif2) {
            System.out.println("Среднее арифметическое элементов первого массива больше второго.");
        } else if (arif1 < arif2) {
            System.out.println("Среднее арифметическое элементов первого массива меньше второго.");
        } else {
            System.out.println("Среднее арифметическое элементов первого массива, равно среднему арифметическому второго.");
        }
    }
}