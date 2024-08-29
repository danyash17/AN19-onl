package vadimavetisov.lesson3;

import java.util.Scanner;

public class lesson3_homework1 {
    //Задание №1. Написать программу для вывода названия поры года по номеру месяца.
    //При решении используйте оператор switch-case.

    public static void main(String[] args) {

        System.out.println("Enter month number: ");
        Scanner s = new Scanner(System.in);
        int inputInt = s.nextInt();

        switch (inputInt) {
            case 12,1,2: {
                System.out.println("Winter");
                break;
            }

            case 3,4,5: {
                System.out.println("Spring");
                break;
            }

            case 6,7,8: {
                System.out.println("Summer");
                break;
            }

            case 9,10,11: {
                System.out.println("Autumn");
                break;
            }
            default:
                System.out.println("Incorrectly! Please use numbers from 1 to 12");
        }
    }

}

