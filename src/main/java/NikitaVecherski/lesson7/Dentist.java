package NikitaVecherski.lesson7;

public class Dentist extends Doctor {

    @Override
    public void heal(Patient patient) {
        System.out.println("Добрый день, я - Дантист. Присаживайтесь на кресло");
        super.heal(patient);
    }
}
