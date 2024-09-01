package alexeystrunets.ht10;

import java.util.Scanner;

public class MainDocumentProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер документа: ");
        String document = scanner.nextLine().trim();

        DocumentProcessor.printFirstTwoBlocks(document);
        System.out.println(DocumentProcessor.replaceLettersWithAsterisks(document));
        System.out.println(DocumentProcessor.extractLetters(document));
        System.out.println(DocumentProcessor.extractLettersUpperCase(document));

        if (DocumentProcessor.containsAbc(document)) {
            System.out.println("Документ содержит последовательность 'abc'.");
        } else {
            System.out.println("Документ не содержит последовательность 'abc'.");
        }

        if (DocumentProcessor.startsWith555(document)) {
            System.out.println("Документ начинается с '555'.");
        } else {
            System.out.println("Документ не начинается с '555'.");
        }

        if (DocumentProcessor.endsWith1a2b(document)) {
            System.out.println("Документ заканчивается на '1a2b'.");
        } else {
            System.out.println("Документ не заканчивается на '1a2b'.");
        }
    }
}