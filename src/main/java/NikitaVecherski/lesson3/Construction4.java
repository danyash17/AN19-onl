package NikitaVecherski.lesson3;

import java.util.Scanner;

//4. Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно»

public class Construction4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("На улице тепло");
        }

        if (-5 >= t && t > -20) {
            System.out.println("На улице нормально");
        }

        if (-20 >= t) {
            System.out.println("На улице холодно");
        }

    }
}

