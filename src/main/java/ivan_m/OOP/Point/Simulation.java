package ivan_m.OOP.Point;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты базовой точки (через пробел):");
        Point basePoint = new Point(scanner.nextInt(), scanner.nextInt());

        System.out.println("Введите координаты исследуемой точки (через пробел):");
        int newX = scanner.nextInt();
        int newY = scanner.nextInt();
        Point newPoint = new Point(newX, newY);

        System.out.println(basePoint.toString());
        System.out.println(newPoint.toString());
        System.out.println("Расстояние между двумя точками - " + basePoint.countDistance(newX, newY));
    }

}
