package artem.homework.hw10;

//Написать программу со следующим функционалом:
//На вход передать строку (будем считать, что это номер документа).
//Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
//а y — это буква.
//        - Вывести на экран в одну строку два первых блока по 4 цифры.
//        - Вывести на экран номер документа, но блоки из трех букв заменить
//          на *** (каждая буква заменятся на *).
//        - Вывести на экран только одни буквы из номера документа в
//          формате yyy/yyy/y/y в нижнем регистре.
//        - Вывести на экран буквы из номера документа в формате
//          "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//          класса StringBuilder).
//        - Проверить содержит ли номер документа последовательность abc и
//          вывети сообщение содержит или нет(причем, abc и ABC считается
//          одинаковой последовательностью).
//        - Проверить начинается ли номер документа с последовательности
//          555.
//        - Проверить заканчивается ли номер документа на
//          последовательность 1a2b.
//Все эти методы реализовать в отдельном классе в статических методах,
//которые на вход (входным параметром) будут принимать вводимую на
//вход программы строку.

public class DocumentProcessor {
    public static void displayNumbers(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + " " + blocks[2]);
    }

    public static void maskLetters(String documentNumber) {
        String maskedBlocks = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(maskedBlocks);
    }

    public static void printLetters(String docLetters) {
        String printLetters = docLetters.replaceAll("[0-9-]", "").toLowerCase();
        System.out.println(printLetters.substring(0, 3) + "/" + printLetters.substring(3, 6) + "/" + printLetters.substring(6, 7) + "/" + printLetters.substring(7));
    }

    public static void printLettersUppercase(String printUppercase) {
        String printLetters = printUppercase.replaceAll("[0-9-]", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append("Letters: ")
                .append(printLetters.substring(0, 3))
                .append("/")
                .append(printLetters.substring(3, 6))
                .append("/")
                .append(printLetters.substring(6, 7))
                .append("/")
                .append(printLetters.substring(7));
        System.out.println(sb);


    }

    public static void containsABC(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void startsWith(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void endsWith(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
