package artem.homework.hw7.t1;

    /*Создать программу для имитации работы клиники.
    Пусть в клинике будет три врача: хирург, терапевт и дантист.
    Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
    Так же предусмотреть класс «Пациент» и класс «План лечения».
    Создать объект класса «Пациент» и добавить пациенту план лечения.
    Так же создать метод, который будет назначать врача пациенту согласно
    плану лечения.
    Если план лечения имеет код 1 – назначить хирурга и выполнить метод
    лечить.
    Если план лечения имеет код 2 – назначить дантиста и выполнить метод
    лечить.
    Если план лечения имеет любой другой код – назначить терапевта и
    выполнить метод лечить*/

public class Clinic {
    public static void main(String[] args) {
        TreatmentPlan firstPlan = new TreatmentPlan(1);
        TreatmentPlan secondPlan = new TreatmentPlan(2);
        TreatmentPlan thirdPlan = new TreatmentPlan(3);

        Patient firstPatient = new Patient("Jhon",secondPlan);
        Patient secondPatient = new Patient("Frank",firstPlan);
        Patient sthirdPatient = new Patient("Kate",thirdPlan);

        assignDoctorAndTreat(firstPatient);
        assignDoctorAndTreat(secondPatient);
        assignDoctorAndTreat(sthirdPatient);
    }

    private static void assignDoctorAndTreat(Patient patient) {
        int code = patient.getTreatmentPlan().getCode();
        Doctor doctor;
        switch (code) {
            case 1:
                doctor = new Surgeon();
                break;

            case 2:
                doctor = new Dentist();
                break;

            default:
                doctor = new Therapist();
                break;
        }

        System.out.println("Выполняется лечение для пациента: " + patient.getName());
        doctor.treat();
    }
}
