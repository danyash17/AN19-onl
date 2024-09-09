package ivan_m.Exceptions.Library;
/*Библиотека
Задача: Поиск книги

Описание: Создать класс Library, который позволяет искать книги по названию. Если книга не найдена, выбрасывать исключение.
Исключения:
BookNotFoundException – если книга не найдена в библиотеке.*/

import java.util.Scanner;

public class Simulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("Jungle Book");
        Book book2 = new Book("Tom Sawyer's Adventures");
        Book book3 = new Book("Harry Potter");
        Book searchableBook;
        Library library = new Library();
        System.out.println("What's the name of your book?");
        searchableBook = new Book(scanner.nextLine());
        System.out.println(library.searchBook(searchableBook, book1, book2, book3));
    }
}
