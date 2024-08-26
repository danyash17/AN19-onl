package Alex_P.lesson7;

public class Therapist implements Doctor {

    @Override
    public void treat() {
        System.out.println("Лечит терапевт");
    }
}
