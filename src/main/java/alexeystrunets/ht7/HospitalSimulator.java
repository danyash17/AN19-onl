package alexeystrunets.ht7;

public class HospitalSimulator {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();

        Patient patient1 = new Patient("Иван", surgeon);
        Patient patient2 = new Patient("Петр", dentist);
        Patient patient3 = new Patient("Мария", therapist);

        treatPatient(patient1);
        treatPatient(patient2);
        treatPatient(patient3);

        System.out.println(surgeon);
        System.out.println(therapist);
        System.out.println(dentist);
        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);
    }

    private static void treatPatient(Patient patient) {
        patient.getDoctor().treat(patient);
    }
}
