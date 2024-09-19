package vadimavetisov.lesson11;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.print("""
                    
                    Пополнить библиотеку, введите - 1. \
                    
                    Удалить книгу из библиотеки, введите - 2. \
                    
                    Найти книгу по названию, введите - 3 \
                    
                    Найти книгу по автору, введите - 4 \
                    
                    Посмотреть список книг в библиотеке, введите - 5. \
                    
                    Выйти, введите - 6. \
                    
                    : \s""");

            String menu = scanner.nextLine();

            if (menu.isEmpty()) {
                System.err.println("Поле не может быть пустым!");
                continue;
            }

            char c1 = menu.charAt(0);

            if (!Character.isDigit(c1)) {
                System.err.println("Вводите только цифру!");
                continue;
            } else if (menu.length() != 1) {
                System.err.println("Выберите цифру из списка!");
                continue;
            }

            int menuInt = Integer.parseInt(menu);

            if (menuInt <= 0 || menuInt >= 7) {
                System.err.println("Выберите цифру из списка!");
                continue;
            }

            switch (menuInt) {

                case 1: {

                    Book book = new Book();

                    while (true) {
                        System.out.println("Введите название книги: ");
                        String title = book.setTitle(scanner.nextLine());

                        if (title.isEmpty()) {
                            System.err.println("Поле не может быть пустым!");
                            continue;
                        }
                        break;
                    }

                    while (true) {
                        System.out.println("Введите автора книги: ");
                        String author = book.setAuthor(scanner.nextLine());

                        if (author.isEmpty()) {
                            System.err.println("Поле не может быть пустым!");
                            continue;
                        }

                        char c = author.charAt(0);

                        if (!Character.isLetter(c)) {
                            System.err.println("Вводите только буквы!");
                            continue;
                        }
                        break;
                    }

                    while (true) {
                        System.out.println("Введите isbn книги: ");
                        String isbn = book.setIsbn(scanner.nextLine());

                        if (isbn.isEmpty()) {
                            System.err.println("Поле не может быть пустым!");
                            continue;
                        } else if (isbn.length() != 13) {
                            System.err.println("Неверный формат isbn!");
                            continue;
                        }

                        char c = isbn.charAt(0);

                        if (!Character.isDigit(c)) {
                            System.err.println("Вводите только цифры!");
                            continue;
                        }
                        break;
                    }

                    while (true) {
                        System.out.println("Введите год издательства книги: ");
                        String year = book.setYear(scanner.nextLine());

                        if (year.isEmpty()) {
                            System.err.println("Поле не может быть пустым!");
                            continue;
                        } else if (year.length() != 4) {
                            System.err.println("Неверный формат года!");
                            continue;
                        }

                        char c = year.charAt(0);

                        if (!Character.isDigit(c)) {
                            System.err.println("Вводите только цифры!");
                            continue;
                        }
                        break;
                    }

                    library.addBook(book);

                    break;
                }

                case 2: {

                    while (true) {
                        System.out.println("Введите isbn книги, чтобы удалить: ");
                        String isbn = scanner.nextLine();

                        if (isbn.isEmpty()) {
                            System.err.println("Поле не может быть пустым!");
                            continue;
                        } else if (isbn.length() != 13) {
                            System.err.println("Неверный формат isbn!");
                            continue;
                        }

                        char c = isbn.charAt(0);

                        if (!Character.isDigit(c)) {
                            System.err.println("Вводите только цифры!");
                            continue;
                        }

                        library.removeBook(isbn);
                        System.out.println("Книга удалена.");
                        break;
                    }
                    break;
                }

                case 3: {

                    while (true) {
                        System.out.println("Для поиска книги, введите название: ");
                        String search = scanner.nextLine();

                        Book searchResult = library.findBookByTitle(search);

                        if (search.isEmpty()) {
                            System.err.println("Поле не может быть пустым!");
                            continue;
                        } else if (searchResult != null) {
                            System.out.println(searchResult);
                        } else {
                            System.err.println("Книга не найдена.");
                        }
                        break;
                    }
                    break;
                }

                case 4: {

                    while (true) {
                        System.out.println("Для поиска книги, введите автора: ");
                        String search = scanner.nextLine();

                        String searchResult = library.findBookByAuthor(search);

                        boolean err = false;

                        if (search.isEmpty()) {
                            System.err.println("Поле не может быть пустым!");
                            continue;
                        } else if (!Objects.equals(searchResult, "[]")) {
                            System.out.println(searchResult);
                        } else {
                            System.err.println("В библиотеке нет такого автора.");
                        }

                        char c = search.charAt(0);

                        if (!Character.isLetter(c)) {
                            System.err.println("Вводите только буквы!");
                            continue;
                        }
                        break;
                    }
                    break;
                }

                case 5: {

                    if (library.listAllBooks().isEmpty()) {
                        System.err.println("Библиотека пуста.");
                    } else {
                        System.out.println(library.listAllBooks());
                    }
                    break;
                }

                case 6: {

                    scanner.close();
                    return;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + menuInt);
            }
        }
    }
}
