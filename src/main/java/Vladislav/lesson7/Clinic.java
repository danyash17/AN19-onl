package Vladislav.lesson7;

public class Clinic {
    public void chooseDoctorAndStartTreating(Patient patient) {
        Doctor doctor;
        switch (patient.getTreatmentPlan().getNumber()) {
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
