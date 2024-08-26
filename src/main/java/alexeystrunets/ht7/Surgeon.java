package alexeystrunets.ht7;

public class Surgeon implements Doctor {
    public void treat(Patient patient) {
        System.out.printf("Хирург проводит хирургическое вмешательство для пациента " + patient.getName() + " %n");
    }

    @Override
    public String toString() {
        return "Surgeon";
    }
}

