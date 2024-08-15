package Vladislav.lesson3;
import java.util.Scanner;


//        2. Написать программу для вывода названия поры года по номеру месяца.
//При решении используйте оператор if-else-if.


public class conditionals2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = s.nextInt();
        if (month == 1 || month == 2 || month == 12){
            System.out.println("winter");
        } else if (month == 3 || month == 4 || month == 5){
            System.out.println("spring");
        } else if (month == 6 || month == 7 || month == 8){
            System.out.println("summer");
        } else if (month == 9 || month == 10 || month == 11){
            System.out.println("autumn");
        } else {
            System.out.println("ERROR");
    }

    }
}
