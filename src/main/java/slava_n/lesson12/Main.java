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
        Book bookThree = new Book("Allan Cake", "Inspiration", 2020, "UsdT");
        Library list = new Library();

        //Добавление книг
        list.addBook(bookOne);
        list.addBook(bookTwo);
        list.addBook(bookThree);

        // Удаление книги
        list.removeBook("asd");

        // Поиск по автору
        if (list.findBookByTitle("Inspiration")) {
            System.out.println("Ваша книга по названию найдена");
        } else {
            throw new InvalidTitleNameException("Книга не найдена");
        }

        // Поиск по автору
        if (list.findBooksByAuthor("Allan Make")) {
            System.out.println("Ваша книга по имени автора найдена, попробуйте еще раз");
        } else {
            throw new InvalidAuthorNameException("Книга по имени автора не найдена");
        }


        list.listAllBooks();
    }
}

