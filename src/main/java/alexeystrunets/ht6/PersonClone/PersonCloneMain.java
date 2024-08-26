package alexeystrunets.ht6.PersonClone;

public class PersonCloneMain {
    public static void main(String[] args) {
        PersonClone person1 = new PersonClone("John", 30);
        PersonClone person2 = person1.clone();

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.equals(person2));
        System.out.println(person1 == person2);
    }

}
