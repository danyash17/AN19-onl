package ivan_m.PillarsOfOOP.Vehicle;

public class Simulation {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(250, "BMW");
        ElectricCar electricCar = new ElectricCar(220, "Tesla", 600);

        System.out.println(car.toString());
        System.out.println(electricCar.toString()); //тут вопрос с выведением данных
    }
}
