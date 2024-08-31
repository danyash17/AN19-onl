package ivan_m.Exceptions.Hospital;
/*Больница
Задача: Регистрация пациента

Описание: Создать класс PatientRegistration, который позволяет регистрировать пациентов. Если имя пациента пустое, выбрасывать исключение.
Если в первый раз пациент не говорит имя, дать ему второй шанс и с помощью try-catch переспросить имя.
Исключения:
InvalidNameException – если имя пациента пустое.*/

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();
        PatientRegistration patientRegistration = new PatientRegistration();

        try {
            System.out.println("Your namе?");
            patient.setName(scanner.nextLine());
            System.out.println(patientRegistration.registerPatient(patient));
        } catch (InvalidNameException e) {
            System.out.println("Repeat your name, please:");
            patient.setName(scanner.nextLine());
            System.out.println(patientRegistration.registerPatient(patient));
        }
    }
}
