package Vladislav.lesson7;

public class Simulation {
    public static void main(String[] args) {
        TreatmentPlan plan = new TreatmentPlan(6);
        Patient patient = new Patient(plan);
        Clinic clinic = new Clinic();
        clinic.choiceDoctor(patient);
    }
}
