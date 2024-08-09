package vadimavetisov.lesson3;

import java.util.Scanner;

public class lesson3_homework3 {
    //3. Напишите программу, которая будет принимать на вход число и на
    //выход будет выводить сообщение четное число или нет.
    //Для определения четности числа используйте операцию получения
    //остатка от деления - операция выглядит так: '% 2').

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner s = new Scanner(System.in);
        int evenOdd = s.nextInt();

        int number = evenOdd;
//
        if (number %2 == 0) {
            System.out.println("The number is - even");
        }
        else if (number %2 >= 0) {
            System.out.println("The number is - odd");
        }
        else {
            System.out.println("Incorrectly! Please, enter only numbers.");
        }
    }

}
