package Vladislav.lesson3;


//Необходимо, чтоб программа выводила на экран вот такую
//последовательность:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//В решении используйте цикл while.


public class cycles4 {
    public static void main(String[] args){
        int Result = 0;
        while (Result < 98) {
            Result = Result + 7;
            System.out.println(Result);
        }
    }
}
