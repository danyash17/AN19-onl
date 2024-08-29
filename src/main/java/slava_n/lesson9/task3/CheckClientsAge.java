package slava_n.lesson9.task3;

public class CheckClientsAge {

    public static void checkClientsAge(int age) {
        if (age > 0 && age < 120) {
            System.out.println("Спасибо!");
        } else {
            throw new InvalidAgeException("Введите корректный возраст");
        }

    }
}
