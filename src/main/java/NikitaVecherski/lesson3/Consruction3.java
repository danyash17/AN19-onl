package NikitaVecherski.lesson3;

import java.util.Scanner;

public class Consruction3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четное или нечетное число");
        String number = scanner.nextLine();

        int n = Integer.parseInt(number);
        if (n % 2 == 0){
            System.out.println("Число является чётным");
        }
        if (n % 2 == 1){
            System.out.println("Число является нечётным");
        }
    }
}
