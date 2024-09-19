package Alex_P.lesson12;

import java.util.ArrayList;
import java.util.UUID;

public class Library {
    private final ArrayList<Book> townLibrary = new ArrayList<>();

    public void addBook(Book book) {
        UUID uuid = UUID.randomUUID();
        book.setIsbn(String.valueOf(uuid));
        townLibrary.add(book);
    }

    public void removeBook(String isbn) throws NoBookException {
        for (Book book : this.townLibrary) {
            if (book.getIsbn().equals(isbn)) {
                this.townLibrary.remove(book);
                break;
            } else throw new NoBookException("Книга с такаим isbn отсутствует в библиотеке");
        }
    }

    public Book findBookByTitle(String title) throws NoBookException {
        for (Book book : this.townLibrary) {
            if (book.getTitle().equals(title)) {
                return book;
            } else throw new NoBookException("Книга с такаим названием отсутствует в библиотеке");
        }
        return null;
    }

    public String listAllBooks() {
        return this.townLibrary.toString();
    }

    public Book findBooksByAuthor(String author) throws NoBookException {
        for (Book book : this.townLibrary) {
            if (book.getAuthor().equals(author)) {
                return book;
            } else throw new NoBookException("Книга с такаим автором отсутствует в библиотеке");
        }
        return null;
    }
}
