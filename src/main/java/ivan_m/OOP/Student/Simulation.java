package ivan_m.OOP.Student;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average1, average2;
        int[] mark1 = new int[5];
        int[] mark2 = new int[5];
        Student student1 = new Student("Ivan",18);
        Student student2 = new Student("Artemiy",11);

        System.out.println("Введите 5 отметок первого студента (от 1 до 10):");
        for (int i = 0; i < 5; i++)
        {
            mark1[i] = scanner.nextInt();
        }
        average1=student1.countAverage(mark1);

        System.out.println("Введите 5 отметок второго студента (от 1 до 10):");
        for (int i = 0; i < 5; i++)
        {
            mark2[i] = scanner.nextInt();
        }
        average2 = student2.countAverage(mark1);

        if (student1.equals(student2))
        {
            System.out.println("У обоих студентов одинаковая успеваемость");
        }
    }
}
