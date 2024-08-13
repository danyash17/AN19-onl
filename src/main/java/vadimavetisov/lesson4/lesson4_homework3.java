package vadimavetisov.lesson4;

import java.util.Arrays;
import java.util.Random;

public class lesson4_homework3 {
    private static final String ANSI_RED = "\u001B[31m";
    ;
    private static final String ANSI_RESET = "\u001B[0m";
    ;
    private static final String ANSI_GREEN = "\u001B[32m";
    ;
    private static final String ANSI_CYAN = "\u001B[36m";;
    ;
    //3. Создайте 2 массива из 5 чисел.
    //Выведите массивы на консоль в двух отдельных строках.
    //Посчитайте среднее арифметическое элементов каждого массива и
    //сообщите, для какого из массивов это значение оказалось больше (либо
    //сообщите, что их средние арифметические равны).

    public static void main(String[] args) {

        int[] firstArr = new int[5];
        int[] secondArr = new int[5];

        Random random = new Random();

        double one = 0;
        double two = 0;

        System.out.println(ANSI_GREEN + "Массив №1:" + ANSI_RESET);

        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = (int) (Math.floor(Math.random() * 9999));
            one = one + firstArr[i];
        }
        System.out.println(Arrays.toString(firstArr));

        System.out.println(ANSI_CYAN + "Среднее арифметическое:" + ANSI_RESET);
        System.out.println(one / firstArr.length);

        System.out.println("");

        System.out.println(ANSI_GREEN + "Массив №2:" + ANSI_RESET);

        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = (int) (Math.floor(Math.random() * 9999));
            two = two + secondArr[i];
        }
        System.out.println(Arrays.toString(secondArr));

        System.out.println(ANSI_CYAN + "Среднее арифметическое:" + ANSI_RESET);
        System.out.println(two / secondArr.length);

        if (one / firstArr.length > two / secondArr.length) {

            System.out.println("");
            System.out.println(ANSI_RED + "Ср. арифметическое массива №1 больше, чем массива №2!" + ANSI_RESET);
        }
            else if (one / firstArr.length < two / secondArr.length) {

            System.out.println("");
            System.out.println(ANSI_RED + "Ср. арифметическое массива №2 больше, чем массива №1!" + ANSI_RESET);
        }
        else {

            System.out.println("");
            System.out.println(ANSI_RED + "Ср. арифметические массива №2 и массива №1 равны!" + ANSI_RESET);
        }
    }
}
