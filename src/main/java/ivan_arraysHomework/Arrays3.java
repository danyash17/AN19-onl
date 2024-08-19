package ivan_arraysHomework;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        int sum1 = 0, sum2 = 0;
        double average1, average2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения первого массива:");
        for (int i = 0; i < mas1.length; i++)
        {
            System.out.print("Введите " + (i+1) + " элемент: ");
            mas1[i] = scanner.nextInt();
            sum1 += mas1[i];
        }
        average1 = (double)sum1 / mas1.length;
        System.out.println(average1);

        System.out.println("Введите значения второго массива:");
        for (int i = 0; i < mas2.length; i++)
        {
            System.out.print("Введите " + (i+1) + " элемент: ");
            mas2[i] = scanner.nextInt();
            sum2 += mas2[i];
        }
        average2 = (double)sum2 / mas2.length;
        System.out.println(average2);

        if (average1 > average2)
        {
            System.out.println("Среднее первого массива больше среднего второго массива");
        }
        else if (average1 < average2)
        {
            System.out.println("Среднее второго массива больше среднего первого массива");
        }
        else
        {
            System.out.println("Средние значения двух массивов равны");
        }
    }
}
