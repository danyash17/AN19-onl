package NikitaVecherski.lesson4;

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
            System.out.println(DoubleStream.of(ArrayRandom).max() + " Является максимальным значением");
            System.out.println(DoubleStream.of(ArrayRandom).average() + " Является средним значением");
            System.out.println(DoubleStream.of(ArrayRandom).min() + " Является минимальным значением");

        }
    }
}
// к сожалению, не нашел как убрать OptionalDouble из вывода, toString не помог :/