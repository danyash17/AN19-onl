package ivan_m.PillarsOfOOP.Doctor;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();

        System.out.println("Что Вас беспокоит? :\n" +
                "1 - Болят зубы\n" +
                "2 - Нужна операция\n" +
                "(любая цифра) - Другое");
        CarePlan carePlan = new CarePlan(scanner.nextInt());
        patient.setCarePlan(carePlan);

        Clinics clinics = new Clinics();
        clinics.assignDoctorAndTreat(patient);
    }
}
