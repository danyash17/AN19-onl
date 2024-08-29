package slava_n.lesson10;

public class StringMethods {

    //- Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void firstTwoBlocksOfNumbers(String documentNumber) {
        System.out.println(documentNumber.substring(0, 4) + " " + documentNumber.substring(9, 13));
    }

    //- Вывести на экран номер документа, но блоки из трех букв заменить
    //на *** (каждая буква заменятся на *).
    public static void replaceThreeLetters(String documentNumber) {
        System.out.println(documentNumber.replaceAll("[a-zA-Z]{3}", "***"));
    }

    //- Вывести на экран только одни буквы из номера документа в
    //формате yyy/yyy/y/y в нижнем регистре.
    public static void onlyLetters(String documentNumber) {
        String modifiedStr = documentNumber.toLowerCase();
        System.out.println(
                modifiedStr.substring(5, 8) + "/" +
                        modifiedStr.substring(14, 17) + "/" +
                        modifiedStr.charAt(19) + "/" +
                        modifiedStr.charAt(21));
    }

    //- Вывести на экран буквы из номера документа в формате
    //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    //класса StringBuilder).
    public static void onlyLettersBuilderUp(String documentNumber) {
        StringBuilder modifiedStr =
                new StringBuilder("Letters: " + documentNumber.replaceAll("[^a-zA-Z]", "").toUpperCase());
        modifiedStr.replace(12, 12, "/");
        modifiedStr.replace(16, 16, "/");
        modifiedStr.replace(18, 18, "/");
        System.out.println(modifiedStr);
    }

    //- Проверить содержит ли номер документа последовательность abc и
    //вывети сообщение содержит или нет(причем, abc и ABC считается
    //одинаковой последовательностью).
    public static void containsSequenceAbc(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Содержит последовательность 'abc' ");
        } else {
            System.out.println("Не содержит последовательность 'abc' ");
        }
    }

    //- Проверить начинается ли номер документа с последовательности
    //555.
    public static void isStartsWithNumber555(String documentNumber) {
        System.out.println(documentNumber.startsWith("555"));
    }

    //- Проверить заканчивается ли номер документа на
    //последовательность 1a2b.
    public static void isEndWith1a2b(String documentNumber) {
        System.out.println(documentNumber.endsWith("1a2b"));
    }
}
