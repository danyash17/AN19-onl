package NikitaVecherski.lesson3;
import java.util.Scanner;

//3. Напишите программу, которая будет принимать на вход число и на
//выход будет выводить сообщение четное число или нет.
//Для определения четности числа используйте операцию получения
//остатка от деления - операция выглядит так: '% 2').

public class Construction3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четное или нечетное число");
        int n = scanner.nextInt();
        if (n % 2 == 0){
            System.out.println("Число является чётным");
        }
        if (n % 2 == 1){
            System.out.println("Число является нечётным");
        }
    }
}
