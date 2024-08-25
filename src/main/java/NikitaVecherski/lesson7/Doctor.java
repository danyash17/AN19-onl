package NikitaVecherski.lesson7;

public abstract class Doctor {

    void heal(Patient patient) {
        patient.setIllnes(null);
        patient.setCured(true);
        patient.setPlan(null);
        System.out.println(patient.getProfile());
    }

}
