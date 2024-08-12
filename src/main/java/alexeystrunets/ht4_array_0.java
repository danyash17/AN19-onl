package alexeystrunets;

import java.util.Scanner;
public class ht4_array_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {1,2,7,8,9,10,5,7};
        boolean found = false;
        while (true) {
            System.out.println("Write your number:");
            int delNum = scan.nextInt();
            for (int num : array) {
                if (num == delNum) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Yes,your number is present");
                break;
            } else {
                System.out.println("No,your number is not in the array");
            }
        }
    }
}