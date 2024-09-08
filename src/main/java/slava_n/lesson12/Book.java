package slava_n.lesson12;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int year;
    private String isbn;

    public Book(String author, String title, int year, String isbn) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.isbn = isbn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && isbn == book.isbn && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, year, isbn);
    }

    @Override
    public String toString() {
        return "Книга: " +
                "автор - " + author + ", название - " + title + ", год - " + year + " isbn - " + isbn + "\n";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
