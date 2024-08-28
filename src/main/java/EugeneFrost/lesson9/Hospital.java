package EugeneFrost.lesson9;

//**task**
// Описание: Создать класс PatientRegistration, который позволяет регистрировать пациентов.
// Если имя пациента пустое, выбрасывать исключение. Если в первый раз пациент не говорит имя,
// дать ему второй шанс и с помощью try-catch переспросить имя.
//Исключения: InvalidNameException – если имя пациента пустое.

public class Hospital {
    public static void main(String[] args) throws InvalidNameException {
        try{
            PatientRegistration.registration();
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
            PatientRegistration.registration();
        }
    }
}
