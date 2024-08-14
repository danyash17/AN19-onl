package vadimavetisov.lesson3;

import java.util.Scanner;

public class lesson3_homework2 {
    //Задание №2. Написать программу для вывода названия поры года по номеру месяца.
    //При решении используйте оператор if-else-if.

    public static void main(String[] args) {

        System.out.println("Enter month number: ");
        Scanner s = new Scanner(System.in);
        int inputInt = s.nextInt();

        if (inputInt == 12 || inputInt == 1 || inputInt == 2) {
            System.out.println("Winter");
        } else if (inputInt == 3 || inputInt == 4 || inputInt == 5) {
            System.out.println("Spring");
        } else if (inputInt == 6 || inputInt == 7 || inputInt == 8) {
            System.out.println("Summer");
        } else if (inputInt == 9 || inputInt == 10 || inputInt == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Incorrectly! Please use numbers from 1 to 12");
        }
    }
}