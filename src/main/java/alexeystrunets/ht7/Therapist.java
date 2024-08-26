package alexeystrunets.ht7;

public class Therapist implements Doctor {
    public void treat(Patient patient) {
        System.out.printf("Терапевт назначает лекарства и процедуры для пациента " + patient.getName() + " %n");
    }

    @Override
    public String toString() {
        return "Therapist";
    }
}