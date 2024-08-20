package NikitaVecherski.lesson7;

import java.util.Random;

public class Patient {

    Integer Illnes;
    boolean cured;

    void gotCured() {
        if (cured == true) {
            System.out.println("Пациент излечен");
        }
    }

    void cameToClinic() {
        System.out.println("Пациент пришел в клинику");
    }

    void isIll() {
        Random random = new Random();
        Illnes = random.nextInt(1, 5);
        if (Illnes == 1) {
            System.out.println("Добрый день, у меня болит пятка :(");
        }
        if (Illnes == 2) {
            System.out.println("Добрый день, у меня болит зуб :(");
        }
        if (Illnes >= 3) {
            System.out.println("Добрый день, у меня болит живот :(");
        }
    }
}


