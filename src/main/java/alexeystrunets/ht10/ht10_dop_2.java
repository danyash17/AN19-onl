package alexeystrunets.ht10;

public class ht10_dop_2 {
    public static void main(String[] args) {
        String str = new String("I love JAVA");
        String shortestWord = Methods.findShortestWord(str);
        String longestWord = Methods.findLongestWord(str);
        System.out.println("Самое короткое слово: " + shortestWord);
        System.out.println("Самое длинное слово: " + longestWord);
    }
}
