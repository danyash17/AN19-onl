package NikitaVecherski.lesson7;

public abstract class Doctor {

    public void heal(Patient patient) {
        patient.setIllnes(null);
        patient.setCured(true);
        patient.setPlan(null);
    }



}
