package slava_n.lesson12;

import slava_n.lesson12.exceptions.InvalidAuthorNameException;
import slava_n.lesson12.exceptions.InvalidTitleNameException;

public class Main {
    public static void main(String[] args) {
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

        Book bookOne = new Book("Allan Wake", "Return", 2018, "asd");
        Book bookTwo = new Book("Allan Make", "Refurd", 2019, "asdT");
        Book bookThree = new Book("Allan Cake", "CalmDown", 2020, "UsdT");
        Book bookFour = new Book("Pushkin", "Filin", 1900, "213sa");
        Library list = new Library();

        //Добавление книг
        list.addBook(bookOne);
        list.addBook(bookTwo);
        list.addBook(bookThree);
        list.addBook(bookFour);

        // Удаление книги
        list.removeBook("asd");

        System.out.println(list.findBookByTitle("Filin"));

        System.out.println(list.findBookByAuthor("Allan Cake"));

        System.out.println(list.listAllBooks());
    }
}

