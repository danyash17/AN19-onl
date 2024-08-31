package ivan_m.PillarsOfOOP.Vehicle;

public class Vehicle {
    private int speed;
    private String model;

    public Vehicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }
}
