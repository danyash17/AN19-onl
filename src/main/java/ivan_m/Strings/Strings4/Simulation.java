package ivan_m.Strings.Strings4;

import java.util.*;
/*Дана строка произвольной длины с произвольными словами.
Написать программу для проверки является ли любое выбранное слово в
строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить
является ли 3-е слово в этой строке палиндромом.
TeachMeSkills.by
Предусмотреть предупреждающие сообщения на случаи ошибочных
ситуаций: например, в строке 5 слов, а на вход программе передали число
500 и т. п. ситуации.*/

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the string:");
        String myString = scanner.nextLine().trim();
        String[] arrayString = myString.split(" ");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < arrayString.length; i++) {
            if (!Objects.equals(arrayString[i], " ")) { //это условие почему-то не работает. В list попадают все элементы массива, включая списки
                list.add(arrayString[i]);
            }
        }

        int wordNumber;
        System.out.println("Select the number of the word, you want to check:");
        wordNumber = scanner.nextInt();
        String word = list.get(wordNumber+1);
        //System.out.println(list.toString());
        //System.out.println(list.size());  для проверки
        //System.out.println(word);
        char[] charWord = word.toCharArray();
        for (int i = 0, j = charWord.length-1; i < charWord.length / 2; i++, j--){
            if (charWord[i] != charWord[j]){
                System.out.println("The word is not a palindrome!");
                return;
            }
        }
        System.out.println("The word is a palindrome!");

        //Проверки для ввода пока не писал
    }
}
