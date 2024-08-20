package daniils.lesson7.inheritance;

public class Programmer extends Human{

    String programmingLanguage;

    public Programmer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void think() {
        System.out.println("Думаю как программист");
    }

    void thinkAsHuman() {
        super.think();
    }
}
