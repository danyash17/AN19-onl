//1. Создание класса "Книга"
//Создайте класс Book, который будет иметь поля: title, author, price и publicationYear. Реализуйте конструктор,
//методы для получения информации о книге и переопределите метод toString() для удобного отображения информации о книге.


package alexeystrunets.ht6.Book;

public class Book {
    private String title;
    private String author;
    private double price;
    private int publicationYear;

    public Book(String title, String author, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                '}';
    }
}