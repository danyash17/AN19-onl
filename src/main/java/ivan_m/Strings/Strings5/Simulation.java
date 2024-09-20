package ivan_m.Strings.Strings5;

import java.util.Scanner;
/*Дана произвольная строка.
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки.
Например, "Hello" -> "HHeelllloo"*/

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the string:");
        String myString = scanner.nextLine();
        char[] arrayString = myString.toCharArray();

        char[] newArrayString = new char[(arrayString.length*2)];
        for (int i = 0, j=0; i < arrayString.length; i++,j++){
            newArrayString[j] = arrayString[i];
            j+=1;
            newArrayString[j] = arrayString[i];
        }
        myString = String.valueOf(newArrayString); //почему String позволил присвоить себе новое значение при том, что он Immutable?
        System.out.println(myString);
    }
}
