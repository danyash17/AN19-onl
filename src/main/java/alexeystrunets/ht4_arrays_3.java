package alexeystrunets;

import java.util.Arrays;

public class ht4_arrays_3 {
    public static void main(String[] args) {
        int[] arr1 = {1,6,3,2,2};
        int[] arr2 = {1,6,3,2,2};
        int sum1 = 0;
        double arif1 =0;
        int sum2 = 0;
        double arif2 =0;
        System.out.println("Первый массив: "+ Arrays.toString(arr1));
        System.out.println("Второй массив: "+Arrays.toString(arr2));
        for (int i=0;i<=arr1.length-1;i++) {
            sum1 += arr1[i];
            arif1 = sum1 / arr1.length;
            sum2 += arr2[i];
            arif2 = sum2 / arr1.length;
        }
        if (arif1>arif2){
            System.out.println("Среднее арифметическое элементов первого массива больше второго.");
        } else if (arif1<arif2) {
            System.out.println("Среднее арифметическое элементов первого массива меньше второго.");
        }
        else {
            System.out.println("Среднее арифметическое элементов первого массива, равно среднему арифметическому второго.");
        }
    }
}