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

public class Methods {
    //  - Вывести на экран в одну строку два первых блока по 4 цифры.
    public static String twoBlocksDigit(String numOfDoc) {
        String[] result = numOfDoc.split("-");
        return result[0]+result[2];
    }

    //  - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public static String numOfDocWithStar(String numOfDoc) {
        String[] result = numOfDoc.split("-");
        String newest = "";
        for (String word : result) {
            if (word.length() == 3) {
                word = word.replaceAll("[a-zA-Z]", "*");
            }
            newest += word;
        }
        return newest;
    }

    //  - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static String lowerCase(String numOfDoc) {
        String[] result = numOfDoc.split("-");
        StringBuilder letters = new StringBuilder();

        if (result.length >= 5) {
            letters.append(result[1].charAt(0)).append(result[1].charAt(1)).append(result[1].charAt(2)).append("/")
                    .append(result[3].charAt(0)).append(result[3].charAt(1)).append(result[3].charAt(2)).append("/")
                    .append(result[4].charAt(1)).append("/")
                    .append(result[4].charAt(3));
        }
        return letters.toString().toLowerCase();
    }

    //  - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y"
//  в верхнем регистре(реализовать с помощью класса StringBuilder).
    public static String upperCase(String numOfDoc) {
        String[] result = numOfDoc.split("-");
        StringBuilder letters = new StringBuilder("Letters:");
        if (result.length >= 5) {
            letters.append(result[1].charAt(0)).append(result[1].charAt(1)).append(result[1].charAt(2)).append("/")
                    .append(result[3].charAt(0)).append(result[3].charAt(1)).append(result[3].charAt(2)).append("/")
                    .append(result[4].charAt(1)).append("/")
                    .append(result[4].charAt(3));
        }
        return letters.toString().toUpperCase();
    }

    //  - Проверить содержит ли номер документа последовательность abc и вывети сообщение
//  содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
    public static boolean checkABC(String numOfDoc) {
        String lowCase = numOfDoc.toLowerCase();
        String sequence = "abc";

        return lowCase.contains(sequence);
    }

    //  - Проверить начинается ли номер документа с последовательности 555.
    public static boolean checkBegin555(String numOfDoc) {
        int index = numOfDoc.indexOf("555");

        return index >= 0;
    }

    //  - Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static boolean checkEnd1a2b(String numOfDoc) {
        int index = numOfDoc.lastIndexOf("1a2b");

        return index >= 0;
    }
}

