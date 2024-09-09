package alexeystrunets.ht10;

public class DocumentProcessor {

    public static void printFirstTwoBlocks(String document) {
        String[] blocks = document.split("-");
        if (blocks.length >= 2) {
            System.out.println(blocks[0] + "-" + blocks[1]);
        }
    }

    public static String replaceLettersWithAsterisks(String document) {
        return document.replaceAll("[a-zA-Z]", "*");
    }

    public static String extractLetters(String document) {
        String[] blocks = document.split("-");
        StringBuilder letters = new StringBuilder();
        if (blocks.length >= 5) {
            letters.append(blocks[2].charAt(0)).append(blocks[3].charAt(0)).append("/")
                    .append(blocks[3].charAt(1)).append("/").append(blocks[4].charAt(0))
                    .append("/").append(blocks[4].charAt(1));
        }
        return letters.toString().toLowerCase();
    }

    public static String extractLettersUpperCase(String document) {
        String[] blocks = document.split("-");
        StringBuilder letters = new StringBuilder("Letters:");
        if (blocks.length >= 5) {
            letters.append(blocks[2].charAt(0)).append(blocks[3].charAt(0)).append("/")
                    .append(blocks[3].charAt(1)).append("/").append(blocks[4].charAt(0))
                    .append("/").append(blocks[4].charAt(1));
        }
        return letters.toString().toUpperCase();
    }

    public static boolean containsAbc(String document) {
        return document.toLowerCase().contains("abc");
    }

    public static boolean startsWith555(String document) {
        return document.length() >= 3 && document.substring(0, 3).equals("555");
    }

    public static boolean endsWith1a2b(String document) {
        return document.length() >= 4 && document.substring(document.length() - 4).equals("1a2b");
    }
}
