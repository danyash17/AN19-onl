package vadimavetisov.lesson3;

import java.util.Scanner;

public class lesson3_homework2 {
    //Задание №2. Написать программу для вывода названия поры года по номеру месяца.
    //При решении используйте оператор if-else-if.

    public static void main(String[] args) {

        System.out.println("Enter month number: ");
        Scanner s = new Scanner(System.in);
        int string = s.nextInt();

        int seasons = string;

        if (seasons==12|seasons==1|seasons==2) {
            System.out.println("Winter");
        }
        else if (seasons==3|seasons==4|seasons==5) {
            System.out.println("Spring");
        }
        else if (seasons==6|seasons==7|seasons==8) {
            System.out.println("Summer");
        }
        else if (seasons==9|seasons==10|seasons==11) {
            System.out.println("Autumn");
        }
        else {
            System.out.println("Incorrectly! Please use numbers from 1 to 12");
        }
    }
}