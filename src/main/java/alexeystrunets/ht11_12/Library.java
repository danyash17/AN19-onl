package alexeystrunets.ht11_12;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) throws BookNotFoundException {
        boolean removed = false;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                removed = true;
                break;
            }
        }
        if (!removed) {
            throw new BookNotFoundException("Книга с ISBN " + isbn + " не найдена.");
        }
    }
    public  Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    public String listAllBooks() {
        if (books.isEmpty()) {
            return "Библиотека пуста.";
        } else {
            String result = "Список книг в библиотеке:\n";
            for (Book book : books) {
                result += book + "\n";
            }
            return result;
        }
    }
    public String findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book.getTitle();
            }
        }
        System.out.println("Книга не найдена");//Не могу додуматься как здесь сделать без sout
        return null;
    }
}
