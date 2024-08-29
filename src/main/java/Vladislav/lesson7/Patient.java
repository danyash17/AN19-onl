package Vladislav.lesson7;

public class Patient {
    private TreatmentPlan treatmentPlan;

    public TreatmentPlan
            getTreatmentPlan() {
        return treatmentPlan;
    }

    Patient (TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void
    setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
