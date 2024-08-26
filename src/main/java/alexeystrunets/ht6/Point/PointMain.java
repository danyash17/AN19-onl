package alexeystrunets.ht6.Point;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(3.0, 4.0);
        Point p2 = new Point(6.0, 8.0);

        System.out.println(p1);
        System.out.println(p2);

        double distance = p1.distanceTo(p2);
        System.out.println("Расстояние между точками: " + distance);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}
