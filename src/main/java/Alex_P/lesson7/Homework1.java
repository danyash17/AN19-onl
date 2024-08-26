package Alex_P.lesson7;

//Создать программу для имитации работы клиники.
//Пусть в клинике будет три врача: хирург, терапевт и дантист.
//Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
//Так же предусмотреть класс «Пациент» и класс «План лечения».
//Создать объект класса «Пациент» и добавить пациенту план лечения.
//Так же создать метод, который будет назначать врача пациенту согласно
//плану лечения.
//Если план лечения имеет код 1 – назначить хирурга и выполнить метод
//лечить.
//Если план лечения имеет код 2 – назначить дантиста и выполнить метод
//лечить.
//Если план лечения имеет любой другой код – назначить терапевта и
//выполнить метод лечить.

public class Homework1 {
    public static void main(String[] args) {

        //пациенты
        Patient patient = new Patient();
        TreatmentPlan treatmentPlan = new TreatmentPlan(44);
        patient.setTreatPlan(treatmentPlan);
        assignDoctor(patient);

    }

    public static void assignDoctor(Patient patient) {
        int treatPlan = patient.getTreatPlan().getTreatmentCode();
        Doctor doctor;

        if (treatPlan == 1) {
            doctor = new Surgeon();
        } else if (treatPlan == 2) {
            doctor = new Therapist();
        } else {
            doctor = new Dantist();
        }

        doctor.treat();
    }

}

