package NikitaVecherski.lesson7;

public class Surgeon extends Doctor {

    @Override
    public void heal(Patient patient) {
        System.out.println("Добрый день, я - Хирург. Показывайте, что у вас");
        super.heal(patient);
    }
}
