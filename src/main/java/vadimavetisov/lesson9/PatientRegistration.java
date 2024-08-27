package vadimavetisov.lesson9;

import java.util.Scanner;

public class PatientRegistration {

    //2. Больница
    //Задача: Регистрация пациента
    //Описание: Создать класс PatientRegistration, который позволяет регистрировать пациентов.
    //Если имя пациента пустое, выбрасывать исключение. Если в первый раз пациент не говорит имя,
    //дать ему второй шанс и с помощью try-catch переспросить имя.
    //Исключения:
    //InvalidNameException – если имя пациента пустое.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. What's your name?");
        String name = scanner.nextLine();

        try {
            System.out.println(name(name));

        } catch (InvalidNameException var4) {
            System.out.println("Please, enter your name: ");
            name = scanner.nextLine();
            System.out.println(name(name));
        }

    }
    //Вопрос 1. Не смог сообразить, как прописать защиту, от ввода любых символов, кроме букв,
    //"'" и "-" (они тоже могут использоваться в имени). Подскажи плиз.
    //Вопрос 2. При соблюдении условия данной задачи в консоли пишется слово "true". На занятии тоже заметил,
    //во время практического задания "1.0" в консоли, при соблюдении условия задачи.
    //Как прописать, чтоб ничего лишнего не показывалось в консоли? Или это особенность try?

    public static boolean name(String name) {
        if (!name.isBlank()) {
            System.out.println("Thank you!");
            return true;
        } else {
            throw new InvalidNameException("This is a required field.");
        }
    }
}
