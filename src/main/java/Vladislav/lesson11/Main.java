package Vladislav.lesson11;


//Создание класса Main:
//
//        Реализуйте меню, позволяющее пользователю выполнять следующие действия:
//Добавить книгу
//Удалить книгу
//Найти книгу по названию
//Вывести список всех книг
//Завершить программу


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        boolean menu = true;

        while (menu) {

            System.out.println("1. Добавить книгу\n" +
                    "2. Удалить книгу\n" +
                    "3. Найти книгу по названию\n" +
                    "4. Найти книги по автору\n" +
                    "5. Вывести список всех книг\n" +
                    "6. завершить программу\n" +
                    "ВВедите номер действия:"
            );

            int inputInt = scanner.nextInt();
            scanner.nextLine();

            switch (inputInt) {

                case 1: {

                    System.out.println("Введите название книги: ");
                    String title = scanner.nextLine();

                    System.out.println("Введите автора книги: ");
                    String author = scanner.nextLine();

                    System.out.println("Введите isbn книги: ");
                    String isbn = scanner.nextLine();

                    System.out.println("Введите год издания книги: ");
                    int year = scanner.nextInt();

                    library.addBook(new Book(title, author, isbn, year));

                    System.out.println("Книга добавлена!");

                    break;
                }

                case 2: {
                    System.out.println("Введите isbn книги, которую вы хотите удалить: ");
                    String string = scanner.nextLine();
                    library.removeBook(String.valueOf(string));
                    System.out.println("Книга удалена!");
                    break;
                }

                case 3: {
                    System.out.println("Введите название книги, которую вы хотите найти: ");
                    String findByTitle = scanner.nextLine();
                    Book foundBook = library.findBookByTitle(findByTitle);
                    System.out.println(foundBook);
                    break;
                }

                case 4: {

                    System.out.println("Введите автора книг: ");
                    String findByAuthor = scanner.nextLine();
                    List<Book> books = library.findBooksByAuthor(findByAuthor);
                    if (books.isEmpty()){
                        System.out.println("Книги не найдены!");
                    } else {
                        for (Book book : books) {
                            System.out.println(book);
                        }
                    }
                    break;
                }

                case 5: {
                    System.out.println("Список книг: ");
                    List<Book> books = library.listAllBooks();
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                }

                case 6: {
                    menu = false;
                    System.out.println("Программа завершена!");
                }

            }

        }
    }
}

