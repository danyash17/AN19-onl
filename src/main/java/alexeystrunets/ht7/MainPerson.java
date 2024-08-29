package alexeystrunets.ht7;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Иван", 25);
        System.out.println(person.getName() + ", " + person.getAge() + " лет.");

        person.celebrateBirthday();

        System.out.println(person.getName() + ", " + person.getAge() + " лет.");
    }
}
