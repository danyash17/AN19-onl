package daniils.lesson7.incapsulation;

public class Microwave {

    private Heater heater = new Heater();
    private RollingDisk rollingDisk = new RollingDisk();
    private Timer timer = new Timer();
    private Lamp lamp = new Lamp();

    private Door door;

    public void heatFood(int seconds){
        timer.start(seconds);
        lamp.enable();
        heater.heat(100);
        rollingDisk.roll();

        timer.stop();
        heater.stopHeat();
        lamp.disable();
        rollingDisk.stop();
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
