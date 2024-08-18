package Alex_P.lesson5;

import java.util.Arrays;
import java.util.Scanner;

//Основное задание 0
//
//Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли.

public class Homework1 {
    public static void main(String[] args) {
        int massLength = 10;
        int[][][] myArray = new int[massLength][massLength][massLength];
        for (int i = 0; i < massLength; i++) {
            for (int j = 0; j < massLength; j++) {
                for (int k = 0; k < massLength; k++) {
                    myArray[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int myNumber = input.nextInt();
        for (int i = 0; i < massLength; i++) {
            for (int j = 0; j < massLength; j++) {
                for (int k = 0; k < massLength; k++) {
                    myArray[i][j][k] += myNumber;
                }
            }
        }

    }
}
