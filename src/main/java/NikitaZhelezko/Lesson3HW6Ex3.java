package NikitaZhelezko;
//lesson 3 Homework 6 exercise 3 cikly
import java.util.Scanner;
public class Lesson3HW6Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int number = scanner.nextInt();
        if (number<=0){
            System.out.println("Пожалуйста, введите положительное число");
        }
        else {
            int sum = 0;
            for (int i=1; i<number; i++){
                sum+=i;
            }
            System.out.println("Сумма чисел от 1 до "+number+ " равна: " + sum);
        }
    }
}
