package vadimavetisov.lesson11;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private String year;

    public String setTitle(String title) {
        this.title = title;
        return title;
    }

    public String getTitle() {
        return title;
    }

    public String setAuthor(String author) {
        this.author = author;
        return author;
    }

    public String getAuthor() {
        return author;
    }

    public String setIsbn(String isbn) {
        this.isbn = isbn;
        return isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String setYear(String year) {
        this.year = year;
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(isbn, book.isbn) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, isbn, author);
    }

    @Override
    public String toString() {
        return "\nНазвание книги: " + title +
                "\nАвтор книги: " + author +
                "\nisbn Книги: " + isbn +
                "\nГод издательства книги: " + year + "\n";
    }
}
