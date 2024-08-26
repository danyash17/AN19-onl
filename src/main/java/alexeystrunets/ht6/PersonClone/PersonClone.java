package alexeystrunets.ht6.PersonClone;

import java.util.Objects;

public class PersonClone implements Cloneable {
    private String name;
    private int age;

    public PersonClone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonClone that = (PersonClone) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public PersonClone clone() {
        try {
            PersonClone clonedPerson = (PersonClone) super.clone();
            return clonedPerson;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
