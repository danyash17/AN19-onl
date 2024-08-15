package EugeneFrost.lesson3;

import java.util.Scanner;

//**task**
//Написать программу для вывода названия поры года по номеру
//месяца.
//При решении используйте оператор if-else-if.

public class cs_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 12");
        int num = sc.nextInt();

        if (num==1 || num==2 || num==12) {
            System.out.println("Зима");
        } else if (num==3 || num==4 || num==5) {
            System.out.println("Весна");
        } else if (num==6 || num==7 || num==8) {
            System.out.println("Лето");
        } else if (num==9 || num==10 || num==11) {
            System.out.println("Осень");
        } else {
            System.out.println("Некорректный ввод");
        }

    }
}


