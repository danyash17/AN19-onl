package Alex_P.lesson4;

import java.util.Arrays;

//одномерные массивы дополнительное задание задача 5
public class Homework3 {
    public static void main(String[] args) {
        int massLength = 10 ;
        int[] myArray = new int[massLength];
        for (int i = 0; i < massLength; i++) {
            myArray[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < massLength; i++) {
            myArray[i] = 0;
            ++i;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
