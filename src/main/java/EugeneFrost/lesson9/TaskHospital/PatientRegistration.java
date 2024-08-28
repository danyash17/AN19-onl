package EugeneFrost.lesson9.TaskHospital;

import java.util.Scanner;

public class PatientRegistration {
    public static void registration() throws InvalidNameException {
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        name = sc.nextLine();

        if (name.isEmpty()) {
            throw new InvalidNameException("Необходимо ввести имя!");
        } else {
            System.out.print("Успех, " + name + "! Вы успешно зарегестрировались.");
        }
    }
}

