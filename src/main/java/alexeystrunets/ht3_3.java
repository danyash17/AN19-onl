package alexeystrunets;

import java.util.Scanner;
public class ht3_3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Please, write your number:");
        int number = scan.nextInt();
        if(number%2==0){
            System.out.println("It's even number");
        } else if(number==0) {
            System.out.println("It's zero");
        }else {
            System.out.println("It's odd number");
        }
    }
}

