package Vladislav.lesson9.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        try {
            AgeVerification.ageVerification(age);
            System.out.println("Всё верно");
        } catch (InvalidAgeException exception) {
            System.out.println("Не верно:  "+ exception.getMessage());
        }
    }
}
