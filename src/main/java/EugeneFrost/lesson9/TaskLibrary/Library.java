package EugeneFrost.lesson9.TaskLibrary;

//**task**
//Описание: Создать класс Library, который позволяет искать книги по названию.
//Если книга не найдена, выбрасывать исключение.
//Исключения: BookNotFoundException – если книга не найдена в библиотеке.

import java.util.Scanner;

public class Library {
    public static void main(String[] args) throws BookNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String[] bookArray = {
                "Война и мир",
                "Мастер и маргарита",
                "Перступление и наказание",
                "Идиот"
        };

        System.out.println("Введите название книги которую нужно найти: ");
        String bookSearchName = scanner.nextLine();

        boolean found = false;

        for (String book : bookArray) {
            if (book.equals(bookSearchName)) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new BookNotFoundException();
        }else {
            System.out.print("Книга найдена");
        }

    }
}