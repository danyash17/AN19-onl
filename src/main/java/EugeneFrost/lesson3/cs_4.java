package EugeneFrost.lesson3;

import java.util.Scanner;

//**task**
//Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно».

public class cs_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите температуру на улице: ");
        int t = sc.nextInt();

        if (t>-5){
            System.out.println("Тепло");
        } else if (t<=-5 && t>-20){
            System.out.println("Нормально");
        } else if (t<=-20) {
            System.out.println("Холодно");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}

