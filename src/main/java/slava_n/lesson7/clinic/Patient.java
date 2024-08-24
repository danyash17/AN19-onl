package slava_n.lesson7.clinic;

class Patient {
    private Doctor doctor;
    private TreatmentPlan treatmentPlan;

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void assignDoctor() {
        if (treatmentPlan.code == 1) {
            doctor = new Surgeon();
        } else if (treatmentPlan.code == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
    }

    public void treatPatient() {
        doctor.treat();
    }
}
