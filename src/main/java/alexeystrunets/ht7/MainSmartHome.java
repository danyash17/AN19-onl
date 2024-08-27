package alexeystrunets.ht7;

public class MainSmartHome {
    public static void main(String[] args) {
        SmartHome home = new SmartHome(false,38.5,false);
        home.turnLightsOn();
        home.setThermostat(22);
        home.activateSecuritySystem();

        home.turnLightsOff();
        home.setThermostat(18);
        home.deactivateSecuritySystem();
    }
}