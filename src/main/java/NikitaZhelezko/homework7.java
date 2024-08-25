package NikitaZhelezko;

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
//выполнить метод лечить
class Doctor {
    public void treat() {
        System.out.println("Доктор лечит пациента.");
    }
}

class Surgeon extends Doctor {
    @Override
    public void treat() {
        System.out.println("Хирург проводит операцию.");
    }
}

class Dentist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Дантист лечит зубы.");
    }
}

class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт проводит общий осмотр.");
    }
}

class Patient {
    private TreatmentPlan treatmentPlan;

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }
}

class TreatmentPlan {
    private int code;

    public TreatmentPlan(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

class Clinic {
    public void assignDoctor(Patient patient) {
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

        doctor.treat();
    }
}

public class homework7 {
    public static void main(String[] args) {
        Patient patient = new Patient();
        TreatmentPlan plan = new TreatmentPlan(2); //Здесь указываем номер плана лечения
        patient.setTreatmentPlan(plan);

        Clinic clinic = new Clinic();
        clinic.assignDoctor(patient);
    }
}