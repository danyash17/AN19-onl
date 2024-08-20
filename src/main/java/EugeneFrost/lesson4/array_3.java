package EugeneFrost.lesson4;

//**task**
//Создайте 2 массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и
//сообщите, для какого из массивов это значение оказалось больше (либо
//сообщите, что их средние арифметические равны).

import java.util.Arrays;

public class array_3 {
    public static void main(String[] args) {
        int[] a = {20, 6, 6, 2, 1};
        int[] b = {15, 3, 6, 7, 4};


        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
        }

        for (int i = 0; i < b.length; i++) {
            sum2 += b[i];
        }

        System.out.println(Arrays.toString(a) + ' ' + sum1);
        System.out.println(Arrays.toString(b) + ' ' + sum2);
        if (sum1 < sum2) {
            System.out.print("Средние арифметическое второго массива болеше чем первого");
        } else if (sum1 > sum2) {
            System.out.print("Средние арифметическое первого массива болеше чем второго");
        } else {
            System.out.print("Средние арифметическое массивов равно");
        }
    }
}
