package slava_n.lesson6;

public class Book {

    //Создайте класс Book, который будет иметь поля: title, author, price и publicationYear.
    // Реализуйте конструктор, методы для получения информации о книге и переопределите метод toString()
    // для удобного отображения информации о книге.

    String title;
    String author;
    double price;
    int publicationYear;

    public Book(String title, String author, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    void getInfo() {
        System.out.println(this.toString());
    }




    @Override
    public String toString() {
        return
                "Title: " + title +
                        ", \n Author: " + author +
                        ", \n Price: " + price +
                        ", \n Publication Year: " + publicationYear;
    }
}
