package ivan_m.Collections.Library;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Book book;
        int actionNumber;
        String bookTitle, bookAuthor, bookIsbn;
        int bookYear;
        System.out.println("Добрый день, уважаемый пользователь!");

        do {
            System.out.println("Выберите одно из действий:\n" +
                    "1 - Добавить книгу\n" +
                    "2 - Удалить книгу\n" +
                    "3 - Найти книгу по названию\n" +
                    "4 - Вывести список всех книг\n" +
                    "5 - Выйти");
            actionNumber = Integer.parseInt(scanner.nextLine());

            switch (actionNumber) {
                case 1:
                    System.out.println("Введите название книги:");
                    bookTitle = String.valueOf(scanner.nextLine());
                    System.out.println("Введите автора книги:");
                    bookAuthor = String.valueOf(scanner.nextLine());
                    System.out.println("Введите ISBN книги:");
                    bookIsbn = String.valueOf(scanner.nextLine());
                    System.out.println("Введите год публикации книги:");
                    bookYear = Integer.parseInt(scanner.nextLine());
                    library.addBook(new Book(bookTitle, bookAuthor, bookIsbn, bookYear));
                    System.out.println("Книга добавлена!");
                    break;
                case 2:
                    System.out.println("Введите ISBN книги, которую хотите удалить:");
                    library.removeBookByISBN(String.valueOf(scanner.nextLine()));
                    System.out.println("Книга успешно удалена!");

                    break;
                case 3:
                    System.out.println("Введите название книги, которую Вы ищете:");
                    System.out.println("Вот Ваша книга: " + library.findBookByTitle(scanner.nextLine()));
                    break;
                case 4:
                    System.out.println(library.listAllBooks());
                    break;
                case 5:
                    System.out.println("До свидания!");
                    break;
            }

        } while (actionNumber != 5);
    }
}
