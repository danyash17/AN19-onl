package alexeystrunets.ht7;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");

        dog.makeSound();
        cat.makeSound();
        animal.makeSound();

    }
}
