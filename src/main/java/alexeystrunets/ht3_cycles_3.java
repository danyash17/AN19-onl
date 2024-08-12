package alexeystrunets;

import java.util.Scanner;

public class ht3_cycles_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Write your number:");
            int number = scan.nextInt();

            if (number >= 0 && number % 2 == 0) {
                System.out.println("Your number suits the conditions, well done!");

                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println(sum);
                break;
            } else {
                System.out.println("Your number does not meet the conditions, rewrite it(");
            }
        }
    }
}