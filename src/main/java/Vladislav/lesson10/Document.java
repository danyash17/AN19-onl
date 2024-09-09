package Vladislav.lesson10;

//Написать программу со следующим функционалом:
//На вход передать строку (будем считать, что это номер документа).
//Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
//а y — это буква.
//- Вывести на экран в одну строку два первых блока по 4 цифры.
//- Вывести на экран номер документа, но блоки из трех букв заменить
//на *** (каждая буква заменятся на *).
//- Вывести на экран только одни буквы из номера документа в
//формате yyy/yyy/y/y в нижнем регистре.
//- Вывести на экран буквы из номера документа в формате
//"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//класса StringBuilder).
//- Проверить содержит ли номер документа последовательность abc и
//вывети сообщение содержит или нет(причем, abc и ABC считается
//одинаковой последовательностью).
//- Проверить начинается ли номер документа с последовательности
//555.
//- Проверить заканчивается ли номер документа на
//последовательность 1a2b.
//Все эти методы реализовать в отдельном классе в статических методах,
//которые на вход (входным параметром) будут принимать вводимую на
//вход программы строку.

import static Vladislav.lesson10.Methods.checkLastSequence;
import static Vladislav.lesson10.Methods.checkSequenceLetter;
import static Vladislav.lesson10.Methods.checkSequenceNumbers;
import static Vladislav.lesson10.Methods.printFirstBlocks;
import static Vladislav.lesson10.Methods.printLowerCase;
import static Vladislav.lesson10.Methods.printReplacedLetters;
import static Vladislav.lesson10.Methods.printUpperCase;

public class Document {
    public static void main(String[] args) {
        String numberDocument = "5553-dBs-3457-ABC-1a2b";
        System.out.println(numberDocument);
        System.out.println("1. " + printFirstBlocks(numberDocument));
        System.out.println("2. " + printReplacedLetters(numberDocument));
        System.out.println("3. " + printLowerCase(numberDocument));
        System.out.println("4. " + printUpperCase(numberDocument));
        System.out.println("5. " + checkSequenceLetter(numberDocument, "abc"));
        System.out.println("6. " + checkSequenceNumbers(numberDocument, "555"));
        System.out.println("7. " + checkLastSequence(numberDocument, "1a2b"));
    }

}
