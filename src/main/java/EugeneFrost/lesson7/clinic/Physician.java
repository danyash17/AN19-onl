package EugeneFrost.lesson7.clinic;

public class Physician implements Treatable {

    public void treat(Patient patient) {
        System.out.println("Терапевт осматривает пациента " + patient.getName() + " и назначает лечение");
    }
}
