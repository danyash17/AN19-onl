package EugeneFrost.lesson10;

//**task**
//Написать программу со следующим функционалом:
//На вход передать строку (будем считать, что это номер документа).
//Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
//  - Вывести на экран в одну строку два первых блока по 4 цифры.
//  - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
//  - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
//  - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y"
//  в верхнем регистре(реализовать с помощью класса StringBuilder).
//  - Проверить содержит ли номер документа последовательность abc и вывети сообщение
//  содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
//  - Проверить начинается ли номер документа с последовательности 555.
//  - Проверить заканчивается ли номер документа на последовательность 1a2b.
//Все эти методы реализовать в отдельном классе в статических методах,
//которые на вход (входным параметром) будут принимать вводимую на
//вход программы строку.

import java.util.Scanner;

public class TaskForString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер документа в формате " + "xxxx-yyy-xxxx-yyy-xyxy, где " + "x — это число, а y — это буква: ");

        String numOfDoc = sc.nextLine();

        Methods.writeTwoBlocksDigit(numOfDoc);
        Methods.writeNumOfDoc(numOfDoc);
        System.out.println(Methods.lowerCase(numOfDoc));
        System.out.println(Methods.upperCase(numOfDoc));
        Methods.checkABC(numOfDoc);
        Methods.checkBegin555(numOfDoc);
        Methods.checkEnd1a2b(numOfDoc);
    }
}
//5555-aBc-4567-BMV-1a2b
//4444-bmv-2345-vmb-4m5n