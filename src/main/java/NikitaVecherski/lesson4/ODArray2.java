package NikitaVecherski.lesson4;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;

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
            double[] ArrayRandom = new double[n];
            for (int i = 0; i < n; i++) {
                ArrayRandom[i] = Math.random();
            }


            String max =(DoubleStream.of(ArrayRandom).max() + " Является максимальным значением");
            max = max.substring(14);

            String avarage = (DoubleStream.of(ArrayRandom).average() + " Является средним значением");
            avarage = avarage.substring(14);

            String min = (DoubleStream.of(ArrayRandom).min() + " Является минимальным значением");
            min = min.substring(14);

            System.out.println(max);
            System.out.println(avarage);
            System.out.println(min);


        }
    }
}
// к сожалению, не нашел как убрать OptionalDouble из вывода, toString не помог :/
// ладно, я нашел как схитрить :)