package daniils.lesson3;

public class Constructions {

    public static void main(String[] args) {

//        int age = 19;

//        if (age >= 18){
//            System.out.println("Okay, вот твой энергетик, или можешь купить спички");
//        }
//        else if (age >= 16){
//            System.out.println("Нет, тебе нет 16 лет, возьми лучше спички");
//        }
//        else {
//            System.out.println("Ничего из этого тебе еще нельзя");
//        }

//        String answer = age >= 18 ? "Okay, вот энергетик или спички" :
//                            age >= 16 ? "Окей, можешь купить спички" : "Извини, нельзя";

//        String animal = "FISH";
//
//        switch (animal){
//            case "DOG": {
//                System.out.println("Woof woof");
//                break;
//            }
//            case "COW": {
//                System.out.println("Moo");
//                break;
//            }
//            default: {
//                System.out.println("...");
//            }
//        }

//        if (animal == "DOG"){
//            System.out.println("Woof woof");
//        }
//        if (animal == "COW"){
//            System.out.println("Moo");
//        }


        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                return;
            }
            System.out.println(i);
        }

//        int i = 0;
//
//        do {
//            System.out.println(i);
//        } while (i > 0);



    }

    public int sum (int n1, int n2){
        return n1 + n2;
    }

}
