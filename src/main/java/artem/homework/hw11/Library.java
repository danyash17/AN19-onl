package artem.homework.hw11;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Книга успешно добавлена");
    }

    public void removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : this.books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;

                break;
            }
        }
        if (bookToRemove != null) {
            this.books.remove(bookToRemove);
            System.out.println("Книга " + bookToRemove + " успешно удалена");
        } else {
            System.out.println("Книга с isbn " + isbn + " не существует");
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        for (Book book : this.books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    public void listAllBooks() {
        if (this.books.isEmpty()) {
            System.out.println("Библиотека пуста");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
