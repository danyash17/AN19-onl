package Alex_P.lesson3;

import java.util.Scanner;
//задача 3 из раздела циклы
public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int intNumber = input.nextInt();
        int i;
        int Sum = 0;
        for (i = 0; i <= intNumber; i++){
            Sum += i;
        }
        System.out.println(Sum);
    }
}
