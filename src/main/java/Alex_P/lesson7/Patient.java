package Alex_P.lesson7;

public class Patient {

    Treatable doctor;
    TreatmentPlan treatPlan;
    int treatCode;

    public Patient(int treatCode) {
        this.treatPlan = new TreatmentPlan(treatCode);

        if (treatPlan.getTreatmentCode() == 1) {
            doctor = new Surgeon();
        } else if (treatPlan.getTreatmentCode() == 2) {
            doctor = new Therapist();

        } else {
            doctor = new Dantist();
        }
    }

    public TreatmentPlan getTreatPlan() {
        return treatPlan;
    }


    public Treatable getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return doctor.heal();
    }
}
