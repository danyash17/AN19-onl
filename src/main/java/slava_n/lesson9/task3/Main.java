package slava_n.lesson9.task3;

import java.util.Scanner;

//Описание: Создайте собственное исключение InvalidAgeException, которое будет выбрасываться, если возраст пользователя меньше 0 или больше 120.
//
//Напишите метод, который принимает возраст пользователя и выбрасывает InvalidAgeException, если возраст некорректен.
//Обработайте это исключение в методе main и выведите понятное сообщение для пользователя.

public class Main extends CheckClientsAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько Вам лет?");
        int age = scanner.nextInt();
        try {
            checkClientsAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Введите корректное значение");
            age = scanner.nextInt();
            checkClientsAge(age);
        }

    }

}


