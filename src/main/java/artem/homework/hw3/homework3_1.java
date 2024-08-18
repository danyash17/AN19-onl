package artem.homework.hw3;

import java.util.Scanner;

public class homework3_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter month: ");
        int numberMonth = console.nextInt();
        String pack;
        switch (numberMonth) {
            case 1:
            case 2:
            case 12:
                pack = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                pack = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                pack = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                pack = "Autumn";
                break;
            default:
                pack = "This month does not exist";
        }
        System.out.println(pack);
    }
}
