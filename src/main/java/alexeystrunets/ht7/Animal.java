package alexeystrunets.ht7;

public class Animal {
    protected String typeOfAnimal;

    public Animal(String typeOfAnimal){
        this.typeOfAnimal = typeOfAnimal;
    }
    public void makeSound (){
        System.out.println("Animal makes a sound: Something");
    }
}
