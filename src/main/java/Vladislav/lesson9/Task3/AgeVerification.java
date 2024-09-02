package Vladislav.lesson9.Task3;

//Описание: Создайте собственное исключение InvalidAgeException,
//которое будет выбрасываться, если возраст пользователя меньше 0 или больше 120.
//Задание:
//Напишите метод, который принимает возраст пользователя и выбрасывает InvalidAgeException, если возраст некорректен.
//Обработайте это исключение в методе main и выведите понятное сообщение для пользователя.

public class AgeVerification {
    public static void ageVerification(int age)
        throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("возраст не входит в диапозон от 0 до 120");
        }
    }
}
