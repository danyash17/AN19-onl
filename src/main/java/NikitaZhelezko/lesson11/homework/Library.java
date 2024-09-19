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
//ArrayList
package NikitaZhelezko.lesson11.homework;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;


    public Library() {
        books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена: " + book);
    }


    public void removeBook(String isbn) throws BookNotFoundException {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Книга удалена: " + bookToRemove);
        } else {
            throw new BookNotFoundException("Книга с ISBN " + isbn + " не найдена.");
        }
    }


    public Book findBookByTitle(String title) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new BookNotFoundException("Книга с названием \"" + title + "\" не найдена.");
    }


    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }


    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println("Все книги в библиотеке:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}


