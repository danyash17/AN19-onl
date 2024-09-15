package Alex_P.lesson12;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> townLibrary = new ArrayList<>();

    public void addBook(Book book) {
        book.setIsbn(String.valueOf((int) (Math.random() * 1000 + 1)));
        townLibrary.add(book);
    }

    public void removeBook(String isbn) throws NoBookException {
        for (Book book : this.townLibrary) {
            if (book.getIsbn() == isbn) {
                this.townLibrary.remove(book);
                break;
            } else throw new NoBookException("Книга с такаим isbn отсутствует в библиотеке");
        }
    }

    public Book findBookByTitle(String title) throws NoBookException {
        for (Book book : this.townLibrary) {
            if (book.getTitle() == title) {
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
            if (book.getTitle() == author) {
                return book;
            } else throw new NoBookException("Книга с такаим автором отсутствует в библиотеке");
        }
        return null;
    }
}
