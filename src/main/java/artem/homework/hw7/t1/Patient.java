package artem.homework.hw7.t1;

public class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public String getName() {
        return name;
    }
}
