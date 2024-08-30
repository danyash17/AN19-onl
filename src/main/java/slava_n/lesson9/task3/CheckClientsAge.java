package slava_n.lesson9.task3;

public class CheckClientsAge {

    public static boolean checkClientsAge(int age) {
        if (age > 0 && age < 120) {
            return true;
        } else {
            throw new InvalidAgeException("Введите корректный возраст");
        }
    }
}
