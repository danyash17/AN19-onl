package alexeystrunets.ht7;

public class Cat extends Animal {

    public Cat(String typeOfAnimal){
        super(typeOfAnimal);
    }
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow");
    }

}
