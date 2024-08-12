package EugeneFrost.lesson4;

//**task**
//Создайте массив целых чисел. Удалите все вхождения заданного
//числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.

import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int[] array = {1, 3, 2, 4, 3, 3, 2, 1};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        int[] secondArray = new int[array.length - count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != n) {
                secondArray[index++] = array[i];
            }
        }

        System.out.println(Arrays.toString(secondArray));

        for (int i = 0; i < array.length; i++) {
            System.out.print("Данного числа нет в массиве ");
            break;
        }

    }
}
