package artem.homework;

import java.util.Scanner;

public class homework3_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter month: ");
        int monthNumber = console.nextInt();

        String season;
        if ((monthNumber == 12) || (monthNumber == 1) || (monthNumber == 2)) {
            season = "Winter";
        } else if ((monthNumber >= 3) && (monthNumber <= 5)) {
            season = "Spring";
        } else if ((monthNumber >= 6) && (monthNumber <= 8)) {
            season = "Summer";
        } else if ((monthNumber >= 9) && (monthNumber <= 11)) {
            season = "Autumn";
        } else {
            season = "Invalid month number";
        }
        System.out.println("Season: " + season);

    }
}

