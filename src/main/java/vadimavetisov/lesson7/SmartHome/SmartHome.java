package vadimavetisov.lesson7.SmartHome;

public class SmartHome {

    Light light = new Light();
    Thermostat thermostat = new Thermostat();

    public void hello() {
        light.on();
        thermostat.on(20);
    }

    public void goodbye() {
        light.off();
        thermostat.off();
    }
}
