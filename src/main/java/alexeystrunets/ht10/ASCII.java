package alexeystrunets.ht10;

public class ASCII {
        public static boolean containsDigits(String input) {
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch >= 48 && ch <= 57) {
                    return true;
                }
            }
            return false;
        }
    }

