package NikitaVecherski.lesson7;


public class Clinic {

    //make array

    private Doctor surgeon;
    private Doctor dentist;
    private Doctor therapist;

    public Clinic() {
        surgeon = new Surgeon();
        dentist = new Dentist();
        therapist = new Therapist();
    }

    void acceptPatient(Patient patient) {
        TreatmentPlan treatmentPlan = new TreatmentPlan(patient.getIllnes());
        patient.setPlan(treatmentPlan);
        switch (patient.getPlan().getCode()) {
            case 1:
                surgeon.heal(patient);
                break;
            case 2:
                dentist.heal(patient);
                break;
            default:
                therapist.heal(patient);
        }
    }

}

