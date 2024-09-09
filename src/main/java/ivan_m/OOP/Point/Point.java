package ivan_m.OOP.Point;

import java.util.Objects;

/*Создайте класс Point, представляющий точку на плоскости с полями x и y.
Реализуйте методы для вычисления расстояния до другой точки, а также переопределите методы equals() и hashCode().*/
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double countDistance(int OtherX, int OtherY) {
        return Math.sqrt(Math.pow((OtherX - x), 2) + Math.pow((OtherY - y), 2));
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
