package slava_n.lesson7.clinic;

public class Therapist extends Doctor {

    @Override
    void treat() {
        System.out.println("Терапевт проводит лечение");
    }
}