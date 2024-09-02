package Alex_P.lesson9;

//Задача 3: Собственные исключения
//Описание: Создайте собственное исключение InvalidAgeException, которое будет выбрасываться, если возраст пользователя меньше 0 или больше 120.
//
//Задание:
//        Напишите метод, который принимает возраст пользователя и выбрасывает InvalidAgeException, если возраст некорректен.
//        Обработайте это исключение в методе main и выведите понятное сообщение для пользователя.

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user's age");
        int age = scanner.nextInt();
        System.out.println("User's age: " + CheckUserAge(age));
    }

    static int CheckUserAge(int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("User's age cant be less then 0");
        } else if (age > 120) {
            throw new InvalidAgeException("User is too old, you must be kidding");
        }
        return age;
    }
}
