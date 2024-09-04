package artem.homework.hw11;

//Создайте программу для управления библиотекой, используя коллекции Java.
// Ваша программа должна включать следующие функции:
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
//      addBook(Book book): добавление книги в библиотеку.
//      removeBook(String isbn): удаление книги по ISBN.
//      findBookByTitle(String title): поиск книги по названию.
//      listAllBooks(): вывод всех книг в библиотеке.
//Создание класса Main:
//
//        Реализуйте меню, позволяющее пользователю выполнять следующие действия:
//        Добавить книгу
//        Удалить книгу
//        Найти книгу по названию
//        Вывести список всех книг
//        Завершить программу
//        Дополнительные требования:
//
//Обработайте возможные исключения (например, при попытке удалить несуществующую книгу).
//Добавьте возможность поиска книг по автору (метод findBooksByAuthor(String author)).


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню библиотеки: ");
            System.out.println("1 - Добавить книгу");
            System.out.println("2 - Удалить книгу");
            System.out.println("3 - Найти книгу по названию");
            System.out.println("4 - Найти книгу по автору");
            System.out.println("5 - Вывести список всех книг");
            System.out.println("6 - Завершить программу");
            System.out.print("Введите номер раздела: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите Название Книги:");
                    String title = scanner.nextLine();

                    System.out.println("Введите Автора Книги:");
                    String author = scanner.nextLine();

                    System.out.println("Введите isbn Книги:");
                    String isbn = scanner.nextLine();

                    System.out.println("Введите год издания Книги:");
                    int year = scanner.nextInt();

                    Book newBook = new Book(title, author, isbn, year);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.println("Введите isbn книги которую хотите удалить: ");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBook(isbnToRemove);
                    break;

                case 3:
                    System.out.println("Введите название книги: ");
                    String titleToFind = scanner.nextLine();
                    Book foundBook = library.findBookByTitle(titleToFind);

                    if (foundBook != null) {
                        System.out.println("Нашли книгу: " + foundBook);
                    } else {
                        System.out.println("Такой книги нет");
                    }
                    break;

                case 4:
                    System.out.println("Введите автора книги: ");
                    String authorToFind = scanner.nextLine();
                    Book foundBookByAuthor = library.findBookByAuthor(authorToFind);

                    if (foundBookByAuthor != null) {
                        System.out.println("Нашли книгу: " + foundBookByAuthor);
                    } else {
                        System.out.println("Такой книги нет");
                    }
                    break;

                case 5:
                    System.out.println("Книги в библиотеке: ");
                    library.listAllBooks();
                    break;

                case 6:
                    System.out.println("Выход");
                    scanner.close();
                    return;

                default:
                    System.out.println("Такой раздел не существует");
            }
        }
    }

}
