package ivan_m.OOP.Book;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book("The Jungle Book", "Rudyard Kipling", 15, 1894);
        int actionNumber;
        System.out.println("Что Вы хотите сделать? \n" +
                "1 - Узнать название книги\n" +
                "2 - Узнать автора книги\n" +
                "3 - Узнать стоимость книги\n" +
                "4 - Узнать год издания книги\n" +
                "5 - Полная информация по книге");
        actionNumber = scanner.nextInt();

        switch (actionNumber) {
            case 1:
                System.out.println(book.titleOutput());
                break;
            case 2:
                System.out.println(book.authorOutput());
                break;
            case 3:
                System.out.println(book.priceOutput() + "$");
                break;
            case 4:
                System.out.println(book.publicationYearOutput());
                break;
            case 5:
                System.out.println(book.toString());
                break;
        }

    }
}
