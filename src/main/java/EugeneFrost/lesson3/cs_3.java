package EugeneFrost.lesson3;

import java.util.Scanner;

//**task**
//Напишите программу, которая будет принимать на вход число и на
//выход будет выводить сообщение четное число или нет.
//Для определения четности числа используйте операцию получения
//остатка от деления - операция выглядит так: '% 2').

public class cs_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите любое число: ");
        int n = sc.nextInt();

        if (n % 2==0) {
            System.out.println("Введённое число чётное");
        } else {
            System.out.println("Введённое чило нечётное");
        }
    }
}

