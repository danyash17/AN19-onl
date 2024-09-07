package slava_n.lesson12;

import slava_n.lesson12.exceptions.InvalidRemoveNameException;
import slava_n.lesson12.exceptions.InvalidTitleNameException;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public void removeBook(String isbn) throws InvalidRemoveNameException {
        if (library.removeIf(Book -> Book.getIsbn().equals(isbn))) {
            library.removeIf(Book -> Book.getIsbn().equals(isbn));
        } else {
            throw new InvalidRemoveNameException("Название не найдено, попробуйте еще раз");
        }
    }

    public boolean findBookByTitle(String title) throws InvalidTitleNameException {
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean findBooksByAuthor(String author) {
        for (Book book : library) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return true;
            }
        }
        return false;
    }

    public void listAllBooks() {
        for (Book book : library) {
            System.out.println(book.toString());
        }
    }
}








