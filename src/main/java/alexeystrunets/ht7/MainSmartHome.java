package alexeystrunets.ht7;

public class MainSmartHome {
    public static void main(String[] args) {
        SmartHome home = new SmartHome(false, 38.5, false);

        home.turnLightsOn();
        if (home.isLightsOn()) {
            System.out.println("Свет включен, можно продолжать.");
        } else {
            System.out.println("Ошибка: Свет не включен.");
        }

        home.setThermostat(22);
        if (home.getThermostat() == 22) {
            System.out.println("Термостат установлен на 22 градуса.");
        }

        home.activateSecuritySystem();
        if (home.isSecuritySystemActive()) {
            System.out.println("Система безопасности активирована.");
        }

        if (home.getThermostat() < 20) {
            home.setThermostat(22);
        }

        home.turnLightsOff();
        if (!home.isLightsOn()) {
            System.out.println("Свет выключен.");
        } else {
            System.out.println("Ошибка: Свет не выключен.");
        }

        home.setThermostat(18);
        if (home.getThermostat() == 18) {
            System.out.println("Термостат установлен на 18 градусов.");
        } else {
            System.out.println("Ошибка: Термостат не установлен на 18 градусов.");
        }

        home.deactivateSecuritySystem();
        if (!home.isSecuritySystemActive()) {
            System.out.println("Система безопасности деактивирована.");
        } else {
            System.out.println("Ошибка: Система безопасности не деактивирована.");
        }
    }
}