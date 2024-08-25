package EugeneFrost.lesson7.clinic;

public class Surgeon implements Treatable {

    public void treat(Patient patient) {
        System.out.println("Хирург проводит операцию пациенту " + patient.getName());
    }
}