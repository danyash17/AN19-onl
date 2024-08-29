package EugeneFrost.lesson7.clinic;

public class Patient {
    String name;
    int treatmentPlan;

    public Patient(String name, int treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public void assignDoctorAndTreat() {
        // В зависимости от плана лечения назначаем врача
        if (treatmentPlan == 1) {
            // Если план лечения равен 1, назначаем хирурга
            Surgeon surgeon = new Surgeon();
            surgeon.treat(this); // Передаем текущего пациента
        } else if (treatmentPlan == 2) {
            // Если план лечения равен 2, назначаем дантиста
            Dentist dentist = new Dentist();
            dentist.treat(this); // Передаем текущего пациента
        } else {
            // Для всех других значений назначаем терапевта
            Physician physician = new Physician();
            physician.treat(this); // Передаем текущего пациента
        }
    }
}
