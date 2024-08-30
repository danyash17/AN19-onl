package ivan_m.PillarsOfOOP.Animal;

import java.util.Scanner;
/*Создайте иерархию классов Animal, Dog, Cat, где Dog и Cat наследуют от Animal.
Реализуйте метод makeSound(), который будет по-разному работать для каждого подкласса. (Наследование, Полиморфизм)*/
public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;
        int animalNumber;

        do {
            System.out.println("Выберите животное:\n" +
                    "1 - Собака\n" +
                    "2 - Кошка");
            animalNumber = scanner.nextInt();
            switch (animalNumber){
                case 1: animal = new Dog();
                break;
                case 2: animal = new Cat();
                break;
                default:
                    System.out.println("Неправильный номер! Попробуйте ещё раз");
                    break;
            }
        }while (animalNumber != 1 && animalNumber!=2);

        System.out.println("Звук выбранного животоного : " + animal.makeSound());
    }

}
