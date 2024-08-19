package daniils.lesson7.polymorphism;

public class Simualtion {

    public static void main(String[] args) {
        Human human1 = new EnglishHuman();
        Human human2 = new EnglishHuman();
        Human human3 = new RussianHuman();

        human1.speak();
        human2.speak();
        human3.speak();
    }

}
