package alexeystrunets;

import java.util.Scanner;
public class ht3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your rainbow color number");
        int number = scan.nextInt();
        switch (number){
            case 1: {
                System.out.println("red");
                break;
            }
            case 2: {
                System.out.println("orange");
                break;
            }
            case 3: {
                System.out.println("yellow");
                break;
            }
            case 4: {
                System.out.println("green");
                break;
            }
            case 5: {
                System.out.println("blue");
                break;
            }
            case 6: {
                System.out.println("dark blue");
                break;
            }
            case 7: {
                System.out.println("purple");
                break;
            }
            default: {
                System.out.println("You're wrong , there are only 7 colors");
            }
        }
    }
}
