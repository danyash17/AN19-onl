package alexeystrunets.ht7;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void celebrateBirthday() {
        age++;
        System.out.println("С днем рождения, " + name + "! Теперь вам " + age + " лет.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
