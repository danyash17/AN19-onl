package NikitaVecherski.lesson7;


public class Clinic {

    public void acceptPatient(Patient patient) {
        TreatmentPlan treatmentPlan = new TreatmentPlan(patient.getIllnes());
        Doctor doctor;
        patient.setPlan(treatmentPlan);
        switch (patient.getPlan().getCode()){
            case 1: doctor = new Surgeon();
            break;
            case 2: doctor = new Dentist();
            break;
            default: doctor = new Therapist();
        }
        doctor.heal(patient);
    }

}

