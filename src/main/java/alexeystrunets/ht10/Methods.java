package alexeystrunets.ht10;

public class Methods {
    
    public static String findShortestWord(String str) {
        String[] words = str.split(" ");
        String shortest = null;
        for(String word : words){
            if (shortest==null||word.length()<shortest.length()){
                shortest =word;
            } else if (shortest.length()==word.length()) {
                shortest=word;
            }
        }
        return shortest;
    }
    public static String findLongestWord(String str){
        String[] words = str.split(" ");
        String longest = null;
        for (String word : words) {
            if (longest == null || word.length() > longest.length()) {
                longest = word;
            } else if (word.length() == longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
