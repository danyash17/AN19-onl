package alexeystrunets.ht4;

import java.util.Arrays;
import java.util.Scanner;

public class Ht4_arrays_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] randomArray = new int[size];
        int max = randomArray[0];
        int min = randomArray[0];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(randomArray));

        for (int i = 0; i < size; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
            }
            if (randomArray[i] < min) {
                min = randomArray[i];
            }
            sum += randomArray[i];
        }
        double average = (double) sum / size;
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
}