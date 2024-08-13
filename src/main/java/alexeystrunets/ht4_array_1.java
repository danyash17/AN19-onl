package alexeystrunets;

import java.util.Scanner;

public class ht4_array_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {1, 5, 8, 9, 10, 2, 8};
        int delNumber = scan.nextInt();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != delNumber) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != delNumber) {
                newArray[k++] = array[i];
            }
        }
        for (int num : newArray) {
            System.out.println(num);
        }
    }
}