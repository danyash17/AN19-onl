package artem.homework.hw6.t3;

    /*Создайте класс Book, который будет иметь поля:
    title, author, price и publicationYear. Реализуйте
    конструктор, методы для получения информации о книге и
    переопределите метод toString() для удобного отображения
    информации о книге.*/

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;
    private int publicationYear;

    public Book(String bookTitle, String bookAuthor, double bookPrice, int publicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        String bookInfo = String.format("Book Title: %s, Book Author: %s, Book Price: %.2f, Publication Year: %d", this.bookTitle, this.bookAuthor, this.bookPrice, this.publicationYear);
        return bookInfo;
    }
}
