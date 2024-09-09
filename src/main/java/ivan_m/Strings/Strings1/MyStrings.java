package ivan_m.Strings.Strings1;

import ivan_m.OOP.Point.Point;

public class MyStrings {

    public static String doTask1(String string) {
        String str1 = string.substring(0, 4);
        String str2 = string.substring(9, 13);
        return str1.concat(str2);
    }

    public static String doTask2(String string) {
        StringBuilder str = new StringBuilder(string);
        str.replace(5,8,"***");
        str.replace(14,17,"***");
        return str.toString();
    }

    public static String doTask3(String string) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            if(((int)string.charAt(i) >= 65 && (int)string.charAt(i) <= 90) || ((int)string.charAt(i) >= 97 && (int)string.charAt(i) <= 122)){
                str.append(string.charAt(i));
            }
        }
        str.insert(3, '/');
        str.insert(7, '/');
        str.insert(9, '/');
        return str.toString();
    }

    public static String doTask4(String string) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            if(((int)string.charAt(i) >= 65 && (int)string.charAt(i) <= 90) || ((int)string.charAt(i) >= 97 && (int)string.charAt(i) <= 122)){
                str.append(string.charAt(i));
            }
        }
        str.insert(3, '/');
        str.insert(7, '/');
        str.insert(9, '/');
        str.insert(0, "Letters:");
        String newString = str.toString();
        return newString.toUpperCase();
    }

    public static String doTask5(String string) {
        if (string.contains("abc") || string.contains("ABC")){
            return "Номер документа содержит последовательность abc(ABC)";
        }
        return "Номер документа НЕ содержит последовательность abc(ABC)";
    }


    public static String doTask6(String string) {
        String str1 = string.substring(0, 3);
        if (str1.equals("555")){
            return "Номер документа начинается с последовательности 555";
        }
        return "Номер документа НЕ начинается с последовательности 555";
    }

    public static String doTask7(String string) {
        String str1 = string.substring(18, 22);
        if (str1.equals("1a2b")){
            return "Номер документа заканчивается последовательность 1a2b";
        }
        return "Номер документа НЕ заканчивается последовательность 1a2b";
    }


}
