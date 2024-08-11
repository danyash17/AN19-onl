package Alex_P.lesson4;

import java.util.Arrays;

//одномерные массивы основное задание задача 3
public class Homework2 {
    public static void main(String[] args) {
        int massLength= 5;
        int[] firstArray = new int[massLength];
        int[] secondArray = new int[massLength];
        int sumFirstArray = 0;
        int sumSecondArray = 0;
        for (int i = 0; i < massLength; i++) {
            sumFirstArray += firstArray[i] = (int) (Math.random()*100);
            sumSecondArray += secondArray[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        String myText;
        if (sumFirstArray/massLength > sumSecondArray/massLength)
            myText = "Средее арифметическое элементов для первого массива больше чем для второго";
        else if (sumFirstArray/massLength < sumSecondArray/massLength)
            myText = "Средее арифметическое элементов для первого массива меньше чем для второго";
        else
            myText = "Средее арифметическое элементов для обоих массивов одинаковое";
        System.out.println(myText);
    }
}
