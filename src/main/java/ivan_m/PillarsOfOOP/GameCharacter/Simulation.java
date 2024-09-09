package ivan_m.PillarsOfOOP.GameCharacter;
/*Создайте иерархию классов GameCharacter, Warrior, Mage, где Warrior и Mage наследуют от GameCharacter.
Реализуйте метод attack(), который будет по-разному работать для каждого подкласса. (Наследование, Полиморфизм)*/

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter gameCharacter = null;
        int gameCharacterNumber;
        do {
            System.out.println("Choose a character:\n" +
                    "1 - Warrior\n" +
                    "2 - Mage");
            gameCharacterNumber = scanner.nextInt();

            switch (gameCharacterNumber) {
                case 1:
                    gameCharacter = new Warrior();
                    break;
                case 2:
                    gameCharacter = new Mage();
                    break;
                default:
                    System.out.println("Incorrect number! Try again");
                    break;
            }
        } while (gameCharacterNumber != 1 && gameCharacterNumber != 2);

        System.out.println(gameCharacter.attack());
    }
}
