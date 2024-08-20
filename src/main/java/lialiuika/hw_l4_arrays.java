package lialiuika;
import java.util.Arrays;
import java.util.Scanner;

public class hw_l4_arrays {
    public static void main(String[] args) {

//

//        Создайте массив целых чисел. Напишете программу, которая выводит
//        сообщение о том, входит ли заданное число в массив или нет.
//                Пусть число для поиска задается с консоли (класс Scanner).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int exactNumber1 = scanner.nextInt();
        int[] num = {1, 2, 3, 4, 5};
        int needed = exactNumber1;
        boolean found = false;

        for (int n : num) {
            if (n == needed) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(needed + " is found.");
        else
            System.out.println(needed + " is not found.");


//Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Пусть размер массива вводится с консоли

        System.out.println("Please enter the number");
        int numberForArray = scanner.nextInt();
        int n = numberForArray;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}






