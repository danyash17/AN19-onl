package alexeystrunets;

import java.util.Scanner;
public class ht3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What temperature is it now?");
        int temperature = scan.nextInt();
        if (temperature>-5){
            System.out.println("Warm");
        } else if (temperature<=-5 && temperature>-20) {
            System.out.println("Fine");
        } else if (temperature<=-20) {
            System.out.println("Cold");
        }
    }
}
