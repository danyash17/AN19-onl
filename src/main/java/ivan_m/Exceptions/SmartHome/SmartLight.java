package ivan_m.Exceptions.SmartHome;

/*Умный дом
Задача: Управление освещением

Описание: Создать класс SmartLight, который включает метод для включения и выключения света. Если свет уже включен или выключен, выбрасывать исключение.
Исключения:
LightAlreadyOnException – если попытаться включить свет, когда он уже включен.
LightAlreadyOffException – если попытаться выключить свет, когда он уже выключен.*/
public class SmartLight {

    String lightOn(Light light) {
        if (light.isMode()) {
            throw new LightAlreadyOnException("Light is already on");
        }
        light.setMode(true);
        return "Light on";
    }

    String lightOff(Light light) {
        if (!light.isMode()) {
            throw new LightAlreadyOffException("Light is already off");
        }
        light.setMode(false);
        return "Light off";
    }
}
