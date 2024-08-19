package ivan_m;

import java.util.Scanner;

public class Conditions3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите число: ");
        number = scanner.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Число " + number + " - чётное");
        }
        else
        {
            System.out.println("Число " + number + " - нечётное");
        }
    }
}
