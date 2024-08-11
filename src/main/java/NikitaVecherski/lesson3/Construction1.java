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

            case "1", "2", "12" : {
                System.out.println("Ваша пора года - Зима"); }
                break;

                case "3","4","5" : {
                    System.out.println("Ваша пора года - Весна");
                }
                break;

                case "6","7","8" : {
                    System.out.println("Ваша пора года - Лето");
                }
                break;

                case "9","10","11" : {
                System.out.println("Ваша пора года - Осень");
                break;

            }
        }



    }
}
