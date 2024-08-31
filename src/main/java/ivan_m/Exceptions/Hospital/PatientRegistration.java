package ivan_m.Exceptions.Hospital;

import java.util.Objects;
import java.util.Scanner;

public class PatientRegistration {

    String registerPatient(Patient patient) {

        if (Objects.equals(patient.getName(), "")) {
            throw new InvalidNameException("You didn't say your name");
        }

        patient.setRegistered(true);
        return "Patient is registered";

    }
}
