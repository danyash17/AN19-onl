package Alex_P.lesson3;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int intNumber = input.nextInt();
        if (intNumber%2 == 0)
            System.out.println("number even");
        else
            System.out.println("number not even");
    }
}
