package artem.homework;
    //Для введенного числа t (температура на улице) вывести
    //Если t>–5, то вывести «Тепло».
    //Если –5>= t > –20, то вывести «Нормально».
    //Если –20>= t, то вывести «Холодно»

import java.util.Scanner;

public class homework3_4 {
    public static void main(String[] args) {
        System.out.println("Please enter the temperature:");
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();

        if (temperature > -5.0) {
            System.out.println("Warm");
        } else if ((temperature <= -5.0) && (temperature > -20.0)) {
            System.out.println("Normal");
        } else if (temperature <= -20.0) {
            System.out.println("Cold");
        }
    }
}
