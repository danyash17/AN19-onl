package vadimavetisov.lesson7.Clinic;

public class Treatment_plan extends Doctor {

    static Doctor doctor1 = new Surgeon();
    static Doctor doctor2 = new Dentist();
    static Doctor doctor3 = new Therapist();

    int code;

    public Treatment_plan(int code) {
        this.code = code;
    }

    public void assignDoctor() {

        if (code == 1) {
            doctor1.treat();
        } else if (code == 2) {
            doctor2.treat();
        } else {
            doctor3.treat();
        }

    }

}