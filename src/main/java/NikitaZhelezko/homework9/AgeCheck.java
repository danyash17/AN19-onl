package NikitaZhelezko.homework9;

//Задача 3: Собственные исключения
//Описание: Создайте собственное исключение InvalidAgeException, которое будет выбрасываться, если возраст пользователя меньше 0 или больше 120.
//
//Задание:
//
//Напишите метод, который принимает возраст пользователя и выбрасывает InvalidAgeException, если возраст некорректен.
//Обработайте это исключение в методе main и выведите понятное сообщение для пользователя.

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


class AgeValidator {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Возраст некорректен: " + age + ". Возраст должен быть в пределах от 0 до 120 лет.");
        }
        System.out.println("Возраст корректен: " + age);
    }
}


public class AgeCheck {
    public static void main(String[] args) {
        int[] testAges = {25, 19, 121, 18};

        for (int age : testAges) {
            try {
                AgeValidator.validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}

