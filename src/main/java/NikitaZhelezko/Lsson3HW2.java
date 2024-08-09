package NikitaZhelezko;
//lesson 3 Homework 2 exercise 3 upravl konstr
import java.util.Scanner;
public class Lsson3HW2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
    int num = scanner.nextInt();
    if (num % 2 == 0) {
        System.out.println("Число чётное");
    }
    else {
        System.out.println("Нечётное");
    }
    }
}
