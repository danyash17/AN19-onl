//ArrayList
package NikitaZhelezko.lesson11.homework;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;


    public Library() {
        books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена: " + book);
    }


    public void removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Книга удалена: " + bookToRemove);
        } else {
            System.out.println("Книга с ISBN " + isbn + " не найдена.");
        }
    }


    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }


    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }


    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println("Все книги в библиотеке:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

