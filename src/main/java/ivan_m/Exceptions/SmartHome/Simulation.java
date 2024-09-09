package ivan_m.Exceptions.SmartHome;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Light light = new Light();
        SmartLight smartLight = new SmartLight();
        int actionNumber;
        System.out.println("The light is off now");
        do {
            System.out.println("What do you wanna do?\n" +
                    "1 - Turn on the light\n" +
                    "2 - Turn off the light\n" +
                    "3 - Exit");
            actionNumber = scanner.nextInt();

            switch (actionNumber) {
                case 1:
                    System.out.println(smartLight.lightOn(light));
                    break;
                case 2:
                    System.out.println(smartLight.lightOff(light));
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Wrong number! Please, try again!");
                    break;
            }
        } while (true);
    }
}
