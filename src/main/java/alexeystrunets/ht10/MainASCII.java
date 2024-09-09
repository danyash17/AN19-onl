package alexeystrunets.ht10;
import java.util.Scanner;
public class MainASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        boolean containsDigits = ASCII.containsDigits(input);
        if (containsDigits) {
            System.out.println("Строка содержит цифры.");
        } else {
            System.out.println("Строка не содержит цифры.");
        }
    }
}
