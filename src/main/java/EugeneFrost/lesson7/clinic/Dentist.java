package EugeneFrost.lesson7.clinic;

public class Dentist implements Treatable {

    public void treat(Patient patient) {
        System.out.println("Стоматолог лечит зубы пациенту " + patient.getName());
    }
}
