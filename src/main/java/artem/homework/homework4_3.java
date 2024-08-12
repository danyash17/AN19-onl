package artem.homework;

    /*Создайте массив и заполните массив.
    Выведите массив на экран в строку.
    Замените каждый элемент с нечётным индексом на ноль.
    Снова выведете массив на экран на отдельной строке.*/

import java.util.Arrays;

public class homework4_3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
