package NikitaVecherski.lesson4;

import java.util.Arrays;
import java.util.Scanner;

//2. Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Пусть размер массива вводится с консоли

public class ODArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Нельзя создать массив с отрицательным кол-вом секций");
        } else {
            double[] arrayrandom = new double[n];
            for (int i = 0; i < n; i++) {
                arrayrandom[i] = Math.random();
            }
            Arrays.sort(arrayrandom);
            String aftersort = Arrays.toString(arrayrandom);
            System.out.println("Ваш массив: \n" + aftersort);
            double min = arrayrandom[0];
            double max = arrayrandom[n-1];
            double avarage = (max - min)/2 + min;

            System.out.println("Минимальное число в массиве: " + min);
            System.out.println("Среднее число в массиве: " + avarage);
            System.out.println("Максимальное число в массиве: " + max);
        }
    }
}
