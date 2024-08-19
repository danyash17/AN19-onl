package NikitaVecherski.lesson3;

// 4. Необходимо, чтоб программа выводила на экран вот такую
//последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//В решении используйте цикл while

public class Cycles4 {
    public static void main(String[] args) {
        int a=7;
        int b=1;
        int c = 0;
        while (c<98) {
            c = a * b;
            b++;
            System.out.println(c);
        }
    }
}