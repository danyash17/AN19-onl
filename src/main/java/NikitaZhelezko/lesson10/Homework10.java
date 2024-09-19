package NikitaZhelezko.lesson10;

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
public class Homework10 {
    public static void printFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + " " + blocks[2]);
    }


    public static void replaceLettersWithAsterisks(String documentNumber) {
        String modifiedNumber = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(modifiedNumber);
    }


    public static void printLettersInLowercase(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "");
        String formattedLetters = letters.substring(0, 3) + "/" + letters.substring(3, 6) + "/"
                + letters.charAt(6) + "/" + letters.charAt(7);
        System.out.println(formattedLetters.toLowerCase());
    }


    public static void printLettersInUppercase(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "");
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:").append(letters.substring(0, 3)).append("/").append(letters.substring(3, 6))
                .append("/").append(letters.charAt(6)).append("/").append(letters.charAt(7));
        System.out.println(sb.toString().toUpperCase());
    }


    public static void containsABC(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Номер документа содержит последовательность abc.");
        } else {
            System.out.println("Номер документа не содержит последовательность abc.");
        }
    }


    public static void startsWith555(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("Номер документа начинается с 555.");
        } else {
            System.out.println("Номер документа не начинается с 555.");
        }
    }


    public static void endsWith1a2b(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Номер документа заканчивается на 1a2b.");
        } else {
            System.out.println("Номер документа не заканчивается на 1a2b.");
        }
    }


    public static void main(String[] args) {
        String documentNumber = "1234-abc-5678-def-1a2b";

        // Вызов методов для выполнения операций над документом
        printFirstTwoBlocks(documentNumber);
        replaceLettersWithAsterisks(documentNumber);
        printLettersInLowercase(documentNumber);
        printLettersInUppercase(documentNumber);
        containsABC(documentNumber);
        startsWith555(documentNumber);
        endsWith1a2b(documentNumber);
    }
}

