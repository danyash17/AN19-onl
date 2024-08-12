package EugeneFrost.lesson4;

//**task**
//Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Пусть размер массива вводится с консоли.

import java.util.Arrays;
import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        int max = 0, min = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random()*100);
        }

        max = Arrays.stream(array).max().getAsInt();
        min = Arrays.stream(array).min().getAsInt();
        avg = Arrays.stream(array).average().getAsDouble();

        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);
    }
}
