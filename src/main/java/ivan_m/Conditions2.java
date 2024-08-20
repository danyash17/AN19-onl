package ivan_m;

import java.util.Scanner;

public class Conditions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth;

        do {
            System.out.println("Введите номер месяца: ");
            numberOfMonth = scanner.nextInt();

            if (numberOfMonth == 12)
            {
                System.out.println("Зима:");
            }
            else if (numberOfMonth == 1)
            {
                System.out.println("Зима:");
            }
            else if (numberOfMonth == 2)
            {
                System.out.println("Зима:");
            }
            else if (numberOfMonth == 3)
            {
                System.out.println("Весна:");
            }
            else if (numberOfMonth == 4)
            {
                System.out.println("Весна:");
            }
            else if (numberOfMonth == 5)
            {
                System.out.println("Весна:");
            }
            else if (numberOfMonth == 6)
            {
                System.out.println("Лето:");
            }
            else if (numberOfMonth == 7)
            {
                System.out.println("Лето:");
            }
            else if (numberOfMonth == 8)
            {
                System.out.println("Лето:");
            }
            else if (numberOfMonth == 9)
            {
                System.out.println("Осень:");
            }
            else if (numberOfMonth == 10)
            {
                System.out.println("Осень:");
            }
            else if (numberOfMonth == 11)
            {
                System.out.println("Осень:");
            }
        }while (numberOfMonth < 1 || numberOfMonth > 12);

    }
}
