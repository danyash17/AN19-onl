package Vladislav.lesson10;

public class Methods {

    //Вывести на экран в одну строку два первых блока по 4 цифры.

    public static String printFirstBlocks(String number) {
        String[] parts = number.split("-");
        return parts[0] + " " + parts[2];
    }


    //- Вывести на экран номер документа, но блоки из трех букв заменить
//на *** (каждая буква заменятся на *).

    public static String printReplacedLetters(String number) {
        String replase = number.replaceAll("[a-zA-Z]{3}", "***");
        return replase;
    }


    //- Вывести на экран только одни буквы из номера документа в
//формате yyy/yyy/y/y в нижнем регистре.

    public static StringBuilder printLowerCase(String number) {
        String letterReplase = number.replaceAll("[^a-zA-Z]", "");
        String replaceAndLowerCase = letterReplase.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(replaceAndLowerCase.substring(0, 3)).append("/")
                .append(replaceAndLowerCase.substring(3, 6)).append("/")
                .append(replaceAndLowerCase.substring(6, 7)).append("/")
                .append(replaceAndLowerCase.substring(7, 8));
        return sb;
    }


    //Вывести на экран буквы из номера документа в формате
//"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//класса StringBuilder).

    public static StringBuilder printUpperCase(String number) {
        String letterReplase = number.replaceAll("[^a-zA-Z]", "");
        String replaceAndUpperCase = letterReplase.toUpperCase();
        StringBuilder sb = new StringBuilder("Letters:");
        sb.append(replaceAndUpperCase.substring(0, 3)).append("/")
                .append(replaceAndUpperCase.substring(3, 6)).append("/")
                .append(replaceAndUpperCase.substring(6, 7)).append("/")
                .append(replaceAndUpperCase.substring(7, 8));
        return sb;
    }

    //Проверить содержит ли номер документа последовательность abc и
//вывети сообщение содержит или нет(причем, abc и ABC считается
//одинаковой последовательностью).

    public static boolean checkSequenceLetter(String number, String sequence) {
        String lowerCase = number.toLowerCase();
        return lowerCase.contains(sequence);
    }

    //- Проверить начинается ли номер документа с последовательности
//555.

    public static boolean checkSequenceNumbers(String number, String sequence) {
        return number.startsWith(sequence);
    }

    //- Проверить заканчивается ли номер документа на
//последовательность 1a2b.

    public static boolean checkLastSequence(String number, String sequence) {
        return number.endsWith(sequence);
    }
}
