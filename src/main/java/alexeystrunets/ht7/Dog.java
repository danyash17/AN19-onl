package alexeystrunets.ht7;

public class Dog extends Animal{

    public Dog(String typeOfAnimal){
        super(typeOfAnimal);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks: Ooh");
    }
}
