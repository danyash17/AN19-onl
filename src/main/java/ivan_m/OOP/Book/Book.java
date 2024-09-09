package ivan_m.OOP.Book;
//Создайте класс Book, который будет иметь поля: title, author, price и publicationYear.
// Реализуйте конструктор, методы для получения информации о книге и переопределите метод toString() для удобного отображения информации о книге.

public class Book {
    private String title;
    private String author;
    private int price;
    private int publicationYear;

    public Book(String title, String author, int price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public String titleOutput() {
        return "Title - " + title;
    }

    public String authorOutput() {
        return "Author - " + author;
    }

    public String priceOutput() {
        return "Price - " + price;
    }

    public String publicationYearOutput() {
        return "Publication year - " + publicationYear;
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
