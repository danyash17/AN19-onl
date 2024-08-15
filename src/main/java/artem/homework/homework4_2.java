package artem.homework;

    /*
    Создайте и заполните массив случайным числами и выведете
    максимальное, минимальное и среднее значение.
    Для генерации случайного числа используйте метод Math.random().
    Пусть будет возможность создавать массив произвольного размера.
    Пусть размер массива вводится с консоли.
    */


import java.util.Arrays;
import java.util.Scanner;

public class homework4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter array size: ");
        int arraySize = console.nextInt();

        double[] someArray = new double[arraySize];

        double maxValue = 0;
        double minValue = 0;
        double sum = 0;

        for (int i = 0; i < arraySize; i++) {
            someArray[i] = Math.random() * 100;
            sum += someArray[i];

            if (i == 0) {
                maxValue = someArray[i];
                minValue = someArray[i];
            } else {
                if (someArray[i] > maxValue) {
                    maxValue = someArray[i];
                }
                if (someArray[i] < minValue) {
                    minValue = someArray[i];
                }
            }
        }
        double average = sum / arraySize;

        System.out.println("Min is: " + minValue);
        System.out.println("Max is: " + maxValue);
        System.out.println("Average is: " + average);
        System.out.println(Arrays.toString(someArray));
    }
}
