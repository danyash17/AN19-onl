package Alex_P.lesson4;

import java.util.Arrays;
import java.util.Scanner;

//одномерные массивы основное задание задача 0
public class Homework1 {
    public static void main(String[] args) {
        int massLength= 10;
        int[] myArray = new int[massLength];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random()*100);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int intNumber = input.nextInt();
        int i;
        String myText = "Число " + intNumber + " не входит в массив";
        for (int massNum : myArray){
            if (intNumber == massNum){
                myText = "Число " + intNumber + " входит в массив";
                break;
            }
        }
        System.out.println(myText);
        System.out.println(Arrays.toString(myArray));
    }
}
