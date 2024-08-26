package Alex_P.lesson7;

public class Surgeon implements Doctor {

    @Override
    public void treat() {
        System.out.println("Лечит хирург");
    }
}
