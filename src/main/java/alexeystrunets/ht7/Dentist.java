package alexeystrunets.ht7;

public class Dentist implements Doctor {
    public void treat(Patient patient) {
        System.out.printf("Дантист лечит зубы пациента " + patient.getName() + " %n");
    }

    @Override
    public String toString() {
        return "Dentist";
    }
}
