package ivan_m.PillarsOfOOP.Doctor;

public class Clinics {
    public void assignDoctorAndTreat(Patient patient) {
        Doctor doctor;
        int code = patient.getCarePlan().getCode();
        switch (code) {
            case 1:
                doctor = new Dentist();
                break;
            case 2:
                doctor = new Surgeon();
                break;
            default:
                doctor = new Therapist();
                break;
        }
        System.out.println(doctor.cure());
    }
}
