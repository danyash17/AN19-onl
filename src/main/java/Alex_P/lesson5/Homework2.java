package Alex_P.lesson5;

//Дополнительное задание
//
//Создайте двумерный массив. Выведите на консоль диагонали массива.

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int massLength = 10;
        Integer[][] myArray = new Integer[massLength][massLength];
        for (int i = 0; i < massLength; i++) {
            for (int j = 0; j < massLength; j++) {
                myArray[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < massLength; i++) {
            System.out.println(Arrays.toString(myArray[i]));
        }
        for (int i = 0; i < massLength; i++) {
            for (int j = 0; j < massLength; j++) {
                if (j != i & j != (massLength - i - 1)) {
                    myArray[i][j] = null;
                }
            }
        }
        System.out.println("=======================================");
        for (int i = 0; i < massLength; i++) {
            System.out.println(Arrays.toString(myArray[i]));
        }
    }
}
