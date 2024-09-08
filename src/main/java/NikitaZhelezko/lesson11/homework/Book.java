//Создайте программу для управления библиотекой, используя коллекции Java. Ваша программа должна включать следующие функции:
//
//Создание класса Book:
//
//Поля: title, author, isbn, year.
//Конструктор и геттеры/сеттеры для всех полей.
//Переопределите метод toString() для удобного отображения информации о книге.
//Переопределите методы equals(), hashCode()
//Создание класса Library:
//
//Используйте ArrayList для хранения списка книг.
//Реализуйте следующие методы:
//addBook(Book book): добавление книги в библиотеку.
//removeBook(String isbn): удаление книги по ISBN.
//findBookByTitle(String title): поиск книги по названию.
//listAllBooks(): вывод всех книг в библиотеке.
//Создание класса Main:
//
//Реализуйте меню, позволяющее пользователю выполнять следующие действия:
//Добавить книгу
//Удалить книгу
//Найти книгу по названию
//Вывести список всех книг
//Завершить программу
//Дополнительные требования:
//
//Обработайте возможные исключения (например, при попытке удалить несуществующую книгу).
//Добавьте возможность поиска книг по автору (метод findBooksByAuthor(String author)).

package NikitaZhelezko.lesson11.homework;


import java.util.*;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Книга{" +
                "Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Год=" + year +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn, year);
    }
}
