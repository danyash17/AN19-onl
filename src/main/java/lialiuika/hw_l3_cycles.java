package lialiuika;
import java.util.Scanner;

public class hw_l3_cycles {
    public static void main(String[] args) {
        //        Циклы
        System.out.println("This is the first task from Циклы");


//        Необходимо вывести на экран числа от 5 до 1.
//        При решении используйте операцию декремента (--).
        for(int i = 5; i>=1; i--){
            System.out.println(i);
        };

        System.out.println("Good! here is the second task from Циклы");
//        4. Необходимо, чтоб программа выводила на экран вот такую
//        последовательность:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//        В решении используйте цикл while.
        int seven_needed = 7;
        while(seven_needed <= 98){
            System.out.println(seven_needed);
            seven_needed+=7;
        }


        System.out.println("Excellent! Here is the third task from Циклы");
//        Напишите программу, где пользователь вводит любое целое
//        положительное число. А программа суммирует все числа от 1 до
//        введенного пользователем числа.
//                Для ввода числа воспользуйтесь классом Scanner
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the needed number");
        int number_in = scanner.nextInt();
        int our_sum = 0;
        for (int i=1; i<= number_in; i++){
            our_sum = our_sum + i;
        }
        System.out.println (our_sum);


        System.out.println("Thank you for checking, Sensei!");
    }
}
