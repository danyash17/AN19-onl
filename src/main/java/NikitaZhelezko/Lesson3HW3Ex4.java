package NikitaZhelezko;
//lesson 3 Homework 3 exercise 4 upravl konstr
import java.util.Scanner;
public class Lesson3HW3Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение температуры t: ");
        int t = scanner.nextInt();
        if (t > -5){
            System.out.println("Тепло");
        } else if ( t >= -20) {
            System.out.println("Нормально");
        }
        else {
            System.out.println("Холодно");
        }
    }
}
