package vadimavetisov.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book uniqueBooks) {
        if (isDuplicateBook(uniqueBooks)) {
            throw new BookDuplicatesException("Книга уже существует в библиотеке!");
        }
        books.add(uniqueBooks);
    }

    public boolean isDuplicateBook(Book bookToAdd) {
        for (Book book : books) {
            if (book.equals(bookToAdd)) {
                return true;
            }
        }
        return false;
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            } else {
                throw new BookNotFoundException("Книга не найдена.");
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                return book;
            }
        }
        return null;
    }

    public String findBookByAuthor(String author) {
        List<Book> byAuthor = new ArrayList<>();

        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                byAuthor.add(book);
            }
        }
        return byAuthor.toString();
    }


    public String listAllBooks() {
        StringBuilder listOfBooks = new StringBuilder();
        for (Book book : books) {
            listOfBooks.append(book);
        }
        return listOfBooks.toString();
    }
}