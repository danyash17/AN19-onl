package alexeystrunets;

import java.util.Scanner;
public class ht3_cycles_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your number:");
        int number = scan.nextInt();
        int sum = 0;
        int step = 1;
        if (number >= 0 && number % 2 == 0) {
            System.out.println("Your number suits the conditions, well done!");
        } else {
            System.out.println("Your number does not meet the conditions, rewrite it(");
            return;
        }
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
