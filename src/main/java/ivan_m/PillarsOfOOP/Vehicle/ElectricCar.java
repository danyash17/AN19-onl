package ivan_m.PillarsOfOOP.Vehicle;

public class ElectricCar extends Vehicle {
    private int batteryLife;

    public ElectricCar(int speed, String model, int batteryLife) {
        super(speed, model);
        this.batteryLife = batteryLife;
    }


    @Override
    public String toString() {
        return "ElectricCar{" +
                "speed=" + getSpeed() +
                ", model=" + getModel() +
                ", batteryLife=" + batteryLife +
                '}';
    }
}
