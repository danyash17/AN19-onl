package alexeystrunets.ht7;

public class SmartHome {
    private boolean lights;
    private  double thermostat;
    private boolean securitySystem;

    public SmartHome(boolean lights,double thermostat,boolean securitySystem){
        this.lights = lights;
        this.securitySystem = securitySystem;
        this.thermostat = thermostat;
    }
    public void turnLightsOn(){
        lights = true;
        System.out.println("Lights on");
    }
    public void turnLightsOff(){
        lights = false;
        System.out.println("Lights off");
    }
    public void setThermostat(double newThermostat){
        this.thermostat = newThermostat;
        System.out.println("Сейчас температура: " + newThermostat + " градусов");
    }
    public void activateSecuritySystem() {
        securitySystem = true;
        System.out.println("Система защиты активирована.");
    }

    public void deactivateSecuritySystem() {
        securitySystem = false;
        System.out.println("Система защиты деактивирована.");
    }
    public boolean isLightsOn() {
        return lights;
    }
    public double getThermostat() {
        return thermostat;
    }
    public boolean isSecuritySystemActive() {
        return securitySystem;
    }
}
