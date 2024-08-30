package ivan_m.PillarsOfOOP.SmartHome;

import ivan_m.PillarsOfOOP.GameCharacter.Mage;
import ivan_m.PillarsOfOOP.GameCharacter.Warrior;

import java.util.Scanner;

/*Создайте класс SmartHome с приватными полями для различных устройств (например, lights, thermostat).
Реализуйте методы для управления этими устройствами. (Инкапсуляция)*/
public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHome smartHome = new SmartHome();
        int actionNumber;
        System.out.println("Good afternoon, Ivan! I'm Yandex smart home");
        do {
            System.out.println("Please, choose a function:\n" +
                    "1 - Start cleaning\n" +
                    "2 - Start cooking");
            actionNumber = scanner.nextInt();

            switch (actionNumber) {
                case 1:
                    smartHome.clean();
                    break;
                case 2:
                    smartHome.cook();
                    break;
                default:
                    System.out.println("Incorrect number! Try again");
                    break;
            }
        } while (actionNumber != 1 && actionNumber != 2);

    }
}
