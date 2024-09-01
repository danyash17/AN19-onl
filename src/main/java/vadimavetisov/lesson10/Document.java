package vadimavetisov.lesson10;

import java.util.Locale;

public class Document {

    public static String twoBlock(String document) {
        return document.substring(0, 4) + "-" + document.substring(9, 13);
    }

    public static String replacement(String document) {
        StringBuilder docNum = new StringBuilder(document);
        docNum.replace(5, 8, "***");
        docNum.replace(14, 17, "***");
        document = docNum.toString();
        return document;
    }

    public static String onlyLett(String document) {
        document = document.toLowerCase();
        return document.substring(5, 8) + "/" + document.substring(14, 17) + "/" + document.substring(19, 20) + "/" + document.substring(21);
    }

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

    public static Boolean contSym(String document) {
        String docNum = "abc";
        document = document.toLowerCase();
        return document.contains(docNum);
    }

    public static Boolean contStart(String document) {
        return document.startsWith("555");
    }

    public static Boolean contEnds(String document) {
        return document.endsWith("1a2b");
    }
}
