package Vladislav.lesson3;
import java.util.Scanner;


//        1. Написать программу для вывода названия поры года по номеру месяца
//При решении используйте оператор switch-case.


public class conditionals1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month number");
        int number = s.nextInt();
        switch (number) {
            case 1:
            case 2:
            case 12: {
                System.out.println("winter");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("spring");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("summer");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("autumn");
                break;
            }
            default: {
                System.out.println("ERROR");
            }
        }
    }
}
