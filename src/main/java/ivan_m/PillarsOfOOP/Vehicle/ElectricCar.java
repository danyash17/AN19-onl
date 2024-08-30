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
                "speed=" +  //тут должно быть поле "Cкорость" для теслы"
                "model=" +  //тут должно быть поле "Модель" для теслы
                "batteryLife=" + batteryLife +
                '}';
    }
}
