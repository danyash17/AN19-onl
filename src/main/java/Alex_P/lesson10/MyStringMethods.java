package Alex_P.lesson10;

public class MyStringMethods {
    static String TwoNumberBlocks(String myString) {
        StringBuilder newString = new StringBuilder();
        int[] myArray = new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = 0;
        for (int num : myArray) {
            if (num == 1) newString.append(myString.charAt(i));
            i++;
        }
        return String.valueOf(newString);
    }

    static String DocNumberWithStars(String myString) {
        StringBuilder newString = new StringBuilder();
        int[] myArray = new int[]{1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1};
        int i = 0;
        for (int num : myArray) {
            if (num == 1) {
                newString.append(myString.charAt(i));
            } else {
                newString.append("*");
            }
            i++;
        }
        return String.valueOf(newString);
    }

    static String LettersLowerCase(String myString) {
        StringBuilder newString = new StringBuilder();
        boolean startOfSubsequence = false;
        for (int i = 0; i < myString.length(); i++) {
            char myChar = myString.charAt(i);
            if (Character.isLetter(myChar)) {
                newString.append(Character.toLowerCase(myChar));
                startOfSubsequence = true;
            } else if (!Character.isLetter(myChar) && startOfSubsequence) {
                newString.append("/");
                startOfSubsequence = false;
            }
        }
        return String.valueOf(newString);
    }

    static String LettersUpperCase(String myString) {
        StringBuilder newString = new StringBuilder("Letters:");
        boolean startOfSubsequence = false;
        for (int i = 0; i < myString.length(); i++) {
            char myChar = myString.charAt(i);
            if (Character.isLetter(myChar)) {
                newString.append(Character.toUpperCase(myChar));
                startOfSubsequence = true;
            } else if (!Character.isLetter(myChar) && startOfSubsequence) {
                newString.append("/");
                startOfSubsequence = false;
            }
        }
        return String.valueOf(newString);
    }

    static boolean StringIncludeString(String firstString, String secondString) {
        if (firstString.toLowerCase().contains(secondString.toLowerCase())) return true;
        return false;
    }

    static boolean StringStartsWithString(String firstString, String secondString) {
        if (firstString.toLowerCase().indexOf(secondString.toLowerCase()) == 0) return true;
        return false;
    }

    static boolean StringEndsWithString(String firstString, String secondString) {
        if (firstString.toLowerCase().indexOf(secondString.toLowerCase()) == firstString.length() - secondString.length()) return true;
        return false;
    }
}
