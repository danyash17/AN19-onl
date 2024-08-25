package Vladislav.lesson7;

public class Clinic {
    void choiceDoctor(Patient patient) {
        Doctor doctor;
        switch (patient.treatmentPlan.number) {
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
