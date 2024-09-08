package vadimavetisov.lesson10;

public class Document {

//Вывести на экран в одну строку два первых блока по 4 цифры.
    public static String twoBlock(String document) {
        return document.substring(0, 4) + "-" + document.substring(9, 13);
    }

//Вывести на экран номер документа, но блоки из трех букв заменить
//на *** (каждая буква заменятся на *).
    public static String replacement(String document) {
        StringBuilder docNum = new StringBuilder(document);
        docNum.replace(5, 8, "***");
        docNum.replace(14, 17, "***");
        document = docNum.toString();
        return document;
    }

//Вывести на экран только одни буквы из номера документа в
//формате yyy/yyy/y/y в нижнем регистре.
    public static String onlyLett(String document) {
        document = document.toLowerCase();
        return document.substring(5, 8) + "/" + document.substring(14, 17) + "/" + document.substring(19, 20) + "/" + document.substring(21);
    }

//Вывести на экран буквы из номера документа в формате
//"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//класса StringBuilder).
    public static String docLett(String document) {
        StringBuilder docNum = new StringBuilder(document);
        docNum.delete(0, 5);
        docNum.delete(4, 9);
        docNum.delete(8, 9);
        docNum.setCharAt(3, '/');
        docNum.setCharAt(7, '/');
        docNum.setCharAt(9, '/');
        document = docNum.toString();
        document = document.toUpperCase();
        return "Letters: " + document;
    }

//Проверить содержит ли номер документа последовательность abc и
//вывети сообщение содержит или нет(причем, abc и ABC считается
//одинаковой последовательностью).
    public static boolean contSym(String document) {
        String docNum = "abc";
        document = document.toLowerCase();
        return document.contains(docNum);
    }

//Проверить начинается ли номер документа с последовательности 555.
    public static boolean contStart(String document) {
        return document.startsWith("555");
    }

//Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static boolean contEnds(String document) {
        return document.endsWith("1a2b");
    }
}
