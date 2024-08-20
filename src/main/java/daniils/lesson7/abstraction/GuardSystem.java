package daniils.lesson7.abstraction;

public class GuardSystem {

    boolean checkPermission(Visitor visitor){
        if (visitor.accessCard != null){
            System.out.println("Opening gates");
            return true;
        }
        System.out.println("You will not path!");
        return false;
    }

}
