package ivan_m.OOP.Student;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double countAverage(int... ints)
    {
        for (int i = 0; i < ints.length; i++)
        {
            grade += ints[i];
        }
        grade /= ints.length;
        return grade;
    }
    // Попытался переопределить equals, но не знаю, как правильно написать последнее условие, чтобы сравнивало grade двух студентов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(grade, student.grade) == 0;
    }
    // И ещё такой момент : метод equals ведь может сказать, равны grade или нет. А если мне надо узнать, чеё grade больше, то нужно писать другой метод вместо equals?
    @Override
    public int hashCode() {
        return Objects.hash(name, age, grade);
    }
}
