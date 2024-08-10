package NikitaVecherski.lesson3;

import java.util.Scanner;

//1. Написать программу для вывода названия поры года по номеру
//месяца

public class Construction1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        String month = scanner.nextLine();
        switch (month){
            case "1": {
                System.out.println("Ваш месяц - Январь");
                break;
            }
        }
        switch (month){
            case "2": {
                System.out.println("Ваш месяц - Февраль");
                break;
            }
        }
        switch (month){
            case "3": {
                System.out.println("Ваш месяц - Март");
                break;
            }
        }
        switch (month){
            case "4": {
                System.out.println("Ваш месяц - Апрель");
                break;
            }
        }
        switch (month){
            case "5": {
                System.out.println("Ваш месяц - Май");
                break;
            }
        }
        switch (month){
            case "6": {
                System.out.println("Ваш месяц - Июнь");
                break;
            }
        }
        switch (month){
            case "7": {
                System.out.println("Ваш месяц - Июль");
                break;
            }
        }
        switch (month){
            case "8": {
                System.out.println("Ваш месяц - Август");
                break;
            }
        }
        switch (month){
            case "9": {
                System.out.println("Ваш месяц - Сентябрь");
                break;
            }
        }
        switch (month){
            case "10": {
                System.out.println("Ваш месяц - Октябрь");
                break;
            }
        }
        switch (month){
            case "11": {
                System.out.println("Ваш месяц - Ноябрь");
                break;
            }
        }
        switch (month){
            case "12": {
                System.out.println("Ваш месяц - Декабрь");
                break;
            }
        }


    }
}
