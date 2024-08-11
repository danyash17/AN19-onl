package Alex_P.lesson3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature ");
        int tempNumber = input.nextInt();
        if (tempNumber <= -20)
            System.out.println("Холодно");
        else if (tempNumber <= -5)
            System.out.println("Нормально");
        else if (tempNumber > -5)
            System.out.println("Тепло");
    }
}
