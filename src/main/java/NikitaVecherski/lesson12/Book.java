package NikitaVecherski.lesson12;

//Создание класса Book:
//Поля: title, author, isbn, year.
//Конструктор и геттеры/сеттеры для всех полей.
//Переопределите метод toString() для удобного отображения информации о книге.
//Переопределите методы equals(), hashCode()

import java.util.Objects;
import java.util.UUID;

public class Book{

                                                         //Поля
    private String title;
    private String author;
    private Integer year;
    private String isbn;

                                                    //Геттеры-сеттеры


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn() {
        this.isbn = String.valueOf(UUID.randomUUID());;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

                                                     //Конструктор
    public Book(String title, String author, Integer year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
        setIsbn();
    }

                                                        //Вывод
    public String toString() {
        return ("\nНазвание книги: " + getTitle() + "\n За авторством: " + getAuthor() + "\n Код ISBN: "+ getIsbn() + "\n Год выпуска: " + getYear());
    }

                                                    //Equals и hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(year, book.year) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, isbn);
    }
}
