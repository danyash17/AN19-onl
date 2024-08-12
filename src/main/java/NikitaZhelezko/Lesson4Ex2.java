package NikitaZhelezko;
//Создайте 2 массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и
//сообщите, для какого из массивов это значение оказалось больше (либо
//сообщите, что их средние арифметические равны).
public class Lesson4Ex2 {
    public static void main(String[] args){
        int[] FirstMassive = {1, 2, 3, 6, 8};
        int[] SecondMassive = {4, 7, 9, 11, 12};
        for (int num: FirstMassive){
            System.out.println(num + "");
        }
        System.out.println();
        for (int num: SecondMassive){
            System.out.println(num + "");
        }
        System.out.println();
        double sum1 = 0;
        for (int num: FirstMassive){
            sum1 += num;
        }
        double average1 = sum1 / FirstMassive.length;
        double sum2 = 0;
        for (int num: SecondMassive){
            sum2 += num;
        }
        double average2 = sum2 / SecondMassive.length;
        System.out.println("Среднее арефмитическое первого массива = " +average1);
        System.out.println("Среднее арефмитическое второго массива = " +average2);
        if (average1 > average2){
            System.out.println("Среднее арефмитическое первого массива больше");
        } else if (average2 > average1) {
            System.out.println("Среднее арефмитическое второго массива больше");
        } else System.out.println("Средние арефмитические массивов равны");
    }
}
