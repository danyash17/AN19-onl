package ivan_m.Strings.Strings2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/*Дана строка произвольной длины с произвольными словами.
Найти самое короткое слово в строке и вывести его на экран.
Найти самое длинное слово в строке и вывести его на экран.
Если таких слов несколько, то вывести последнее из них.*/


//Задание не доделано. Проблему скидывал в группу в тг
public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the string:");

        String startString = scanner.nextLine().trim();
        String[] arrayString = startString.split(" ");

        System.out.println(Arrays.toString(arrayString));

        int maxlength = arrayString[0].length();
        int minlength = arrayString[0].length();
        String smallWord = "";
        String bigWord = "";
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].length() > maxlength) {
                maxlength = arrayString[i].length();
                bigWord = arrayString[i];
            }
            if (arrayString[i].length() < minlength && !Objects.equals(arrayString[i], "")) {
                minlength = arrayString[i].length();
                smallWord = arrayString[i];
            }
        }
        System.out.println("The shortest word - " + smallWord);
        System.out.println("The longest word - " + bigWord);
        System.out.println();
    }
}
