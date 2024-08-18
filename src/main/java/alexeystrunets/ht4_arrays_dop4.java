package alexeystrunets;

import java.util.Arrays;
import java.util.Scanner;

public class ht4_arrays_dop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            System.out.println("Введите размер массива: ");
            int size = scan.nextInt();
            if (size > 5 && size <= 10) {
                int[] randomArray = new int[size];
                for (int i = 0; i < size; i++) {
                    randomArray[i] = (int) (Math.random() * 100);
                }
                System.out.println(Arrays.toString(randomArray));

                int n = 0;
                for (int i = 0; i < size; i++) {
                    if (i % 2 == 0) {
                        n++;
                    }
                }
                int[] secondArray = new int[n];
                int index = 0;
                for (int i = 0; i < size; i++) {
                    if (i % 2 == 0) {
                        secondArray[index] = randomArray[i];
                        index++;
                    }
                }
                System.out.println(Arrays.toString(secondArray));
                flag = true;
            } else {
                System.out.println("Размер массива не удовлетворяет условию,повторите ввод пожалуйста.");
            }
        }
    }
}
