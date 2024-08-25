package NikitaVecherski.lesson7;

public class Therapist extends Doctor {

    @Override
    void heal(Patient patient) {
        System.out.println("Добрый день, я - Терапевт. Скажите А");
        super.heal(patient);
    }

}
