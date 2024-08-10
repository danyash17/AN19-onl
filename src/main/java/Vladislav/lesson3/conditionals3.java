package Vladislav.lesson3;
import java.util.Scanner;


//        3. Напишите программу, которая будет принимать на вход число и на
//        выход будет выводить сообщение четное число или нет.
//        Для определения четности числа используйте операцию получения
//        остатка от деления - операция выглядит так: '% 2').


public class conditionals3 {
    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        System.out.println("Ведите число:");
        int t = s.nextInt();
        if ((t % 2)==0){
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}
