package lialiuika;
import java.util.Scanner;


public class hw_l3_constructions {
    public static void main(String[] args) {
        //        Управляющие конструкции
        System.out.println("Hello! This is the first task from Управляющие конструкции");

//1. Написать программу для вывода названия поры года по номеру
//месяца.
//При решении используйте оператор switch-case.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month number");
        int month_number = scanner.nextInt();
        switch (month_number) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("There are only 12 months");
        }

        System.out.println("Cool! So the next task is is the second task from Управляющие конструкции");

//        Напишите программу, которая будет принимать на вход число и на
//        выход будет выводить сообщение четное число или нет.
//        Для определения четности числа используйте операцию получения
//        остатка от деления - операция выглядит так: '% 2')
        System.out.println("Please enter the number");
        int number_parity = scanner.nextInt();
        if (number_parity % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        ;

        System.out.println("Wow! Let's move forward to the third tasks from Управляющие конструкции");

//        Для введенного числа t (температура на улице) вывести
//        Если t>–5, то вывести «Тепло».
//        Если –5>= t > –20, то вывести «Нормально».
//        Если –20>= t, то вывести «Холодно».

        System.out.println("Please enter the temperature");
        int temperature = scanner.nextInt();
        if (temperature > -5) {
            System.out.println("Тепло");
        } else if (temperature > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }


        System.out.println("Congratulations! You checked first 3 task from Управляющие конструкции. Now you should switch to Циклы");
    }
}
