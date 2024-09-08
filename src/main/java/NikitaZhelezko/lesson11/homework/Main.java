package NikitaZhelezko.lesson11.homework;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Удалить книгу");
            System.out.println("3. Найти книгу по названию");
            System.out.println("4. Найти книги по автору");
            System.out.println("5. Вывести список всех книг");
            System.out.println("6. Выйти");
            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите ISBN книги: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Введите год издания книги: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    library.addBook(new Book(title, author, isbn, year));
                    break;

                case 2:
                    System.out.print("Введите ISBN книги для удаления: ");
                    String isbnToRemove = scanner.nextLine();
                    try {
                        library.removeBook(isbnToRemove);
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Введите название книги: ");
                    String titleToFind = scanner.nextLine();
                    try {
                        Book foundBook = library.findBookByTitle(titleToFind);
                        System.out.println("Найдена книга: " + foundBook);
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Введите автора для поиска: ");
                    String authorToFind = scanner.nextLine();
                    var foundBooks = library.findBooksByAuthor(authorToFind);
                    if (!foundBooks.isEmpty()) {
                        System.out.println("Найдены книги:");
                        for (Book b : foundBooks) {
                            System.out.println(b);
                        }
                    } else {
                        System.out.println("Книги не найдены.");
                    }
                    break;

                case 5:
                    library.listAllBooks();
                    break;

                case 6:
                    exit = true;
                    System.out.println("Программа завершена.");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }

        scanner.close();
    }
}
