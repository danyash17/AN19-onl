package ivan_arraysHomework;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        int[] array = {1, 4, -9, 3, 12, -123};
        int number;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        number = scanner.nextInt();

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == number)
            {
                check = true;
                break;
            }
        }
        if (check)
        {
            System.out.println("Число " + number + " входит в массив");
        }
        else
        {
            System.out.println("Число " + number + " не входит в массив");
        }
    }
}
