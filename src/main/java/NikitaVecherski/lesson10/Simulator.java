package NikitaVecherski.lesson10;

//1. Написать программу со следующим функционалом:
//На вход передать строку (будем считать, что это номер документа).
//Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
//а y — это буква.
//        - Вывести на экран в одну строку два первых блока по 4 цифры.
//- Вывести на экран номер документа, но блоки из трех букв заменить
//на *** (каждая буква заменятся на *).
//        - Вывести на экран только одни буквы из номера документа в
//формате yyy/yyy/y/y в нижнем регистре.
//        - Вывести на экран буквы из номера документа в формате
//"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//        класса StringBuilder).
//        - Проверить содержит ли номер документа последовательность abc и
//вывети сообщение содержит или нет(причем, abc и ABC считается
//        одинаковой последовательностью).
//        - Проверить начинается ли номер документа с последовательности
//555.
//        - Проверить заканчивается ли номер документа на
//последовательность 1a2b.
//Все эти методы реализовать в отдельном классе в статических методах,
//которые на вход (входным параметром) будут принимать вводимую на
//вход программы строку.

import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер документа по формату xxxx-yyy-xxxx-yyy-xyxy, где x — это число,а y — это буква");
        String docNum = scanner.next();

        //Вывести на экран в одну строку два первых блока по 4 цифры.
        System.out.println (Logic.task1(docNum));
        //- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        System.out.println (Logic.task2(docNum));
        //- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        System.out.println(Logic.task3(docNum));
        //- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
        System.out.println(Logic.task4(docNum));
        //- Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считаетс одинаковой последовательностью).
        System.out.println(Logic.task5(docNum));
        //Проверить начинается ли номер документа с последовательности 555.
        System.out.println(Logic.task6(docNum));
        //Проверить заканчивается ли номер документа на последовательность 1a2b.
        System.out.println(Logic.task7(docNum));
    }
}
