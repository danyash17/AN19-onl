package artem.homework.hw7.t2;

    /*Создайте иерархию классов Animal, Dog, Cat, где Dog и Cat наследуют от Animal.
    Реализуйте метод makeSound(), который будет по-разному работать для каждого
    подкласса. (Наследование, Полиморфизм)*/

public class Simulation {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        dog.makeSound();
    }
}
