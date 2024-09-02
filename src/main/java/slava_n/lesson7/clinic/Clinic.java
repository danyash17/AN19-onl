package slava_n.lesson7.clinic;

class Clinic {
    public void assignDoctor(Patient patient) {
        int code = patient.getTreatmentPlan().getCode();
        Doctor doctor;

        if (code == 1) {
            doctor = new Surgeon();
        } else if (code == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
        doctor.treat();
    }
}
