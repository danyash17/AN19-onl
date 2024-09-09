package slava_n.lesson12;

import slava_n.lesson12.exceptions.InvalidAuthorNameException;
import slava_n.lesson12.exceptions.InvalidRemoveNameException;
import slava_n.lesson12.exceptions.InvalidTitleNameException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public void removeBook(String isbn) throws InvalidRemoveNameException {
        Book bookToDelete = null;
        for (Book book : library) {
            if (book.getIsbn().equals(isbn)) {
                bookToDelete = book;
                break;
            }
        }

        if (bookToDelete != null) {
            library.remove(bookToDelete);
        } else {
            throw new InvalidRemoveNameException("Данная книга не найдена");
        }
    }


    public Book findBookByTitle(String title) throws InvalidTitleNameException {
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new InvalidTitleNameException("Книги с таким названием не найдено");
    }


    public Book findBookByAuthor(String author) throws InvalidAuthorNameException{
        for (Book book : library) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        throw new InvalidAuthorNameException("Книг с таким авторством не найдено");
    }

    public String listAllBooks() {
        String result = "";
        for (Book book : library) {
           result += book.toString();
        }
        return result;
    }
}








