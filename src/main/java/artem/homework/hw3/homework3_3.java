package artem.homework.hw3;

import java.util.Scanner;

public class homework3_3 {
    public static void main(String[] args) {
        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();

        if ((testNumber % 2) == 0) {
            System.out.println("Number " + testNumber + " is Even");
        } else {
            System.out.println("Number " + testNumber + " is Odd");

        }

    }

}
